package network.shiming.com.network.retrofit;

/**
 * Created by shiming on 2017/4/3.
 */
public abstract class SubscriberListener<T> {
    public abstract void onSuccess(T response);
    //why  后台定义来改动
    public abstract void onFail(String errorCode,String errorMsg);

    public abstract void onError(Throwable e);
    public void onCompleted(){

    }
    public void onBegin(){}
    //如果app需要检查你的账号是否在别的设备上登录，根据返回吗在这里做登录的操作
    //每当用户在app中请求了一次网络的请求的话，就会走到这个方法里，然后在这个方法中做统一的操作
    //比如退出app，重新登录。。。
    public abstract void checkLogin(String errorCode,String erroMsg);
}
