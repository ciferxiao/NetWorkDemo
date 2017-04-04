package network.shiming.com.demo.model;

import android.content.Context;

import java.util.ArrayList;

import network.shiming.com.demo.bean.MuerDataBean;
import network.shiming.com.demo.bean.TadayBean;
import network.shiming.com.demo.bean.TestBeanDemo;
import network.shiming.com.demo.service.TestService;
import network.shiming.com.network.retrofit.BaseSubscriber;
import network.shiming.com.network.retrofit.HttpMethod;
import network.shiming.com.network.retrofit.SMResponse;
import network.shiming.com.network.retrofit.SMRetrofit;
import rx.Observable;

/**
 * Created by shiming on 2017/4/3.
 *
 * import rx.Observable; 注意这里的导入的是哪个包下的  不要导入了其他的安卓报下的observable了  就行了
 */
public class TestModel {

    private  TestService mTestService;
    private  TestService mService;

    public TestModel(Context context){
        mService = SMRetrofit.getService(context, TestService.class);


//        mTestService = SMRetrofit.getInstance(context).getBuild().create(TestService.class);
    }
    public void getData(String cityname, String json, int num, String key,BaseSubscriber infos){
        Observable<SMResponse<TestBeanDemo>> data = mService.getData(cityname,key);
        HttpMethod.toSubscribe(data,infos);
    }
    public void getCai(String cai,BaseSubscriber infos){
        Observable<SMResponse<MuerDataBean>> data = mService.getCai("木耳宫保鸡丁","0957e30ccccb65803c74e37d66cb5093");
        HttpMethod.toSubscribe(data,infos);
    }
    public void getTaday(String cai,BaseSubscriber infos){
        Observable<SMResponse<ArrayList<TadayBean>>> data = mService.getTaday("b15674dbd34ec00ded57b369dfdabd90", "1.0", 4, 4);
        HttpMethod.toSubscribe(data,infos);
    }

}
