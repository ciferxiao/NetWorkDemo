package network.shiming.com.demo.persenter;

import android.content.Context;

import java.util.ArrayList;

import network.shiming.com.demo.bean.MuerDataBean;
import network.shiming.com.demo.bean.TadayBean;
import network.shiming.com.demo.bean.TestBeanDemo;
import network.shiming.com.demo.model.TestModel;
import network.shiming.com.demo.view.TestView;
import network.shiming.com.network.retrofit.BaseSubscriber;
import network.shiming.com.network.retrofit.SMResponse;
import network.shiming.com.network.retrofit.SubscriberListener;

/**
 * Created by shiming on 2017/4/3.
 */
public class TestPersenter {

    private  Context mContext;
    private  TestView mView;
    private final TestModel mTestModel;

    public TestPersenter(Context context, TestView view){
        mContext = context;
        mView = view;
        mTestModel = new TestModel(context);
    }
    public void getData(String cityname, String json,String key, int num){
        mTestModel.getData(cityname,json,1,key,new BaseSubscriber<SMResponse<TestBeanDemo>>(new SubscriberListener<SMResponse<TestBeanDemo>>(){


            @Override
            public void onSuccess(SMResponse<TestBeanDemo> response) {
                System.out.println( "shiming "+response.reason);
//                mView.success(response.data);
            }

            @Override
            public void onFail(String errorCode, String errorMsg) {
                    mView.fail(errorCode, errorMsg);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("shiming "+e);
            }

            @Override
            public void checkLogin(String errorCode, String erroMsg) {

            }
        }));

    }
    public void getCai(String cai) {
        mTestModel.getCai(cai, new BaseSubscriber<SMResponse<MuerDataBean>>(new SubscriberListener<SMResponse<MuerDataBean>>() {


            @Override
            public void onSuccess(SMResponse<MuerDataBean> response) {
                System.out.println("shiming " + response.ruselt+"why null");
                System.out.println("shiming " + response.reason+"why reason");
                System.out.println("shiming " + response.error_code+"why error_code");
                System.out.println("shiming " + response+"why resultcode");
//                mView.getCatSuccess(response.data);
            }

            @Override
            public void onFail(String errorCode, String errorMsg) {
                mView.fail(errorCode, errorMsg);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("shiming " + e);
            }

            @Override
            public void checkLogin(String errorCode, String erroMsg) {

            }
        }));
    }
    public void getTaday(String cai) {
        mTestModel.getTaday(cai, new BaseSubscriber<SMResponse<ArrayList<TadayBean>>>(new SubscriberListener<SMResponse<ArrayList<TadayBean>>>() {


            @Override
            public void onSuccess(SMResponse<ArrayList<TadayBean>> response) {
                System.out.println("shiming  onSuccess" + response.ruselt+" why null");
                System.out.println("shiming onSuccess" + response.reason+" why reason");
                System.out.println("shiming onSuccess" + response.error_code+" why error_code");
                System.out.println("shiming onSuccess" + response+"why resultcode");
//                mView.getTadayBean(response.data);
            }

            @Override
            public void onFail(String errorCode, String errorMsg) {
                mView.fail(errorCode, errorMsg);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("shiming " + e);
            }

            @Override
            public void checkLogin(String errorCode, String erroMsg) {

            }
        }));
    }
}
