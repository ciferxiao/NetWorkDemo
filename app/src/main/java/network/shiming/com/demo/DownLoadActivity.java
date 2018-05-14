package network.shiming.com.demo;

import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.lang.ref.WeakReference;

import network.shiming.com.network.down_load.DownLoadAPI;
import network.shiming.com.network.down_load.DownloadProgressListener;
import network.shiming.com.network.down_load.LogListener;
import rx.Subscriber;

/**
 * btn_down_load
 *
 */
public class DownLoadActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnDownLoad;
    private TextView mTvProgress;
    private InnerHandler mInnerHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down_load);

        mBtnDownLoad = (Button) findViewById(R.id.down_load_btn);
        mTvProgress = (TextView) findViewById(R.id.down_load_progress);
        mBtnDownLoad.setOnClickListener(this);

        mInnerHandler = new InnerHandler(this);

    }
    public class InnerHandler extends Handler {
        //弱应用，在另外一个地方会讲到
        private final WeakReference<DownLoadActivity> mActivityWeakReference;

        public InnerHandler(DownLoadActivity activity){
            mActivityWeakReference=new WeakReference<DownLoadActivity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==1){
                String str = (String) msg.obj;
                Toast.makeText(DownLoadActivity.this,str,Toast.LENGTH_SHORT).show();
                mTvProgress.setText(str);
            }
        }
    }
    @Override
    public void onClick(View v) {
        //http://static.haokukeji.cn/coolbox/20180425AD10801920__FV__152c451bf58448a535691285a688faf5.mp4

        new DownLoadAPI("http://static.haokukeji.cn/coolbox/", new DownloadProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
                Log.d("FileDownLoad", "bytesRead=="+bytesRead);//2
                Log.d("FileDownLoad", "contentLength=="+contentLength);//2
                if (bytesRead%2==0) {
                    final Message message = Message.obtain();
                    message.obj = "bytesRead==" + bytesRead + "+contentLength==" + contentLength;
                    message.what = 1;
                    mInnerHandler.sendMessage(message);
                }
                if (done) {
                    Log.d("FileDownLoad", "done");//2
                    final Message message = Message.obtain();
                    message.obj = "bytesRead==" + bytesRead + "+contentLength==" + contentLength;
                    message.what = 1;
                    mInnerHandler.sendMessage(message);
                }
            }
        }).downloadAPK("20180425AD10801920__FV__152c451bf58448a535691285a688faf5.mp4", getCachePath(), new Subscriber() {
            @Override
            public void onCompleted() {
                Log.d("FileDownLoad", "onCompleted");//5
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }
            @Override
            public void onNext(Object o) {
                Log.d("FileDownLoad", "onNext");//4
            }
        }, new LogListener() {
            @Override
            public void Log() {
                Log.d("FileDownLoad", "Log");//3
                Log.d( "FileDownLoad","文件下载完成，文件名：" + "20180425AD10801920__FV__152c451bf58448a535691285a688faf5.mp4" + ",文件路径：" + getCachePath() + ",");

            }
        });
    }

    public static String getCachePath() {
        String dir = Environment.getExternalStorageDirectory() + "/net_download/";
        File f = new File(dir);
        if (!f.exists()) {
            f.mkdirs();
        }
        return dir;
    }
}
