package network.shiming.com.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import network.shiming.com.demo.bean.MuerDataBean;
import network.shiming.com.demo.bean.TadayBean;
import network.shiming.com.demo.bean.TestBeanDemo;
import network.shiming.com.demo.bean.bean;
import network.shiming.com.demo.persenter.TestPersenter;
import network.shiming.com.demo.view.TestView;

public class MainActivity extends AppCompatActivity implements TestView, View.OnClickListener {
    public static final String uri="index";
    public static final String uri2="toh";
    public static final String uricai="query.php";
    public static final String key="40c3793614f9d45c265d7e0529cadc39";

    private TextView mTv;
    private TestPersenter mTestPersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (TextView) findViewById(R.id.text);
        mTestPersenter = new TestPersenter(this, this);
        mTv.setOnClickListener(this);

        mTestPersenter.getTaday("d");
    }

    @Override
    public void success(TestBeanDemo bean) {

    }

    @Override
    public void getCatSuccess(MuerDataBean bean) {

    }

    @Override
    public void getTadayBean(ArrayList<TadayBean> bean) {
        System.out.println( "shiming" +this.getClass().getName());
        System.out.println("shiming "+bean);
    }

    @Override
    public void fail(String error_code, String msg) {
        System.out.println("shiming error"+msg);
    }

    @Override
    public void onClick(View v) {
//        mTestPersenter.getData("%e6%b7%b1%e5%9c%b3","json",key,1);
    }
}
