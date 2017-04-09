package network.shiming.com.demo.persenter;

import android.content.Context;

import java.util.ArrayList;

import network.shiming.com.demo.bean.TadayBean;
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

    public void getTaday(int nomth,int day) {
        mTestModel.getTaday(nomth,day, new BaseSubscriber<SMResponse<ArrayList<TadayBean>>>(new SubscriberListener<SMResponse<ArrayList<TadayBean>>>() {
            @Override
            public void onSuccess(SMResponse<ArrayList<TadayBean>> response) {
                if (response.result!=null){
                    mView.getTadayBean(response.result);
                }
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
