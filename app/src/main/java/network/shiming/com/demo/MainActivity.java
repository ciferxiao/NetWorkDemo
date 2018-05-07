package network.shiming.com.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    public static final String uri2="queryEvent.php";
    private TestPersenter mTestPersenter;
    private Button mBtn;
    private EditText mDay;
    private EditText mMonth;
    private RecyclerView mRecyclerView;
    private SMAdapter mSmAdapter;
   // http://v.juhe.cn/todayOnhistory/queryEvent.php?key=b15674dbd34ec00ded57b369dfdabd90&date=1/1
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
        mSmAdapter = new SMAdapter(this, null);
        mRecyclerView.setAdapter(mSmAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initView() {
        mBtn = (Button) findViewById(R.id.btn);
        mMonth = (EditText) findViewById(R.id.et_month);
        mDay = (EditText) findViewById(R.id.et_day);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }


    @Override
    public void getTadayBean(ArrayList<TadayBean> bean) {
        mSmAdapter.addData(bean);
    }

    @Override
    public void fail(String error_code, String msg) {
        System.out.println("shiming error"+msg);
    }

    @Override
    public void onClick(View v) {
        //点击请求网络  其实这里的参数在这里传入的话 才好，但是我在做测试 就简便了onCompleted
        //还望见谅
        System.out.println("shiming "+mMonth.getText());
        System.out.println("shiming "+mDay.getText());
        System.out.println("shiming mMonth"+mMonth.getText().equals(""));
        System.out.println("shiming mDay"+mDay.getText().equals(""));
        if (TextUtils.isEmpty(mMonth.getText())||TextUtils.isEmpty(mDay.getText())){
            Toast.makeText(MainActivity.this,"不能为空",Toast.LENGTH_SHORT).show();
        }else {
            mTestPersenter.getTaday(1,mMonth.getText()+"/"+mDay.getText());
        }
    }
}
