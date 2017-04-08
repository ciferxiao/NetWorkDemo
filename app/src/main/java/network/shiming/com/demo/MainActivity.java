package network.shiming.com.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import network.shiming.com.demo.bean.TadayBean;
import network.shiming.com.demo.persenter.TestPersenter;
import network.shiming.com.demo.view.TestView;


/**
 * Created by shiming on 2017/4/3.
 * desc 如有不懂的地方  可以联系我的邮箱 lamshiming@sina.com
 * 网络框架  简单的封装了一下
 * 互相学习
 */
public class MainActivity extends AppCompatActivity implements TestView, View.OnClickListener {
    public static final String uri2="toh";
    private TextView mTv;
    private TestPersenter mTestPersenter;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
        //p层的绑定
        mTestPersenter = new TestPersenter(this, this);
    }

    private void initListener() {
        mBtn.setOnClickListener(this);
    }

    private void initView() {
        mTv = (TextView) findViewById(R.id.text);
        mBtn = (Button) findViewById(R.id.btn);
    }


    @Override
    public void getTadayBean(ArrayList<TadayBean> bean) {
        mTv.setText(" 数据成功 ：\n\r"+bean.get(0).day+" "+bean.get(0).title+" "+bean.get(0).year);
    }

    @Override
    public void fail(String error_code, String msg) {
        System.out.println("shiming error"+msg);
        mTv.setText("数据失败\n\r"+msg);
    }

    @Override
    public void onClick(View v) {
        //点击请求网络  其实这里的参数在这里传入的话 才好，但是我在做测试 就简便了
        //还望见谅
        mTestPersenter.getTaday("d");
    }
}
