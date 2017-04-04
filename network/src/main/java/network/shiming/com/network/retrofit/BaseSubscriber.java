package network.shiming.com.network.retrofit;

import android.util.Log;

import rx.Subscriber;

/**
 * Created by shiming on 2017/4/3.
 * 订阅者
 */
public class BaseSubscriber<T extends SMResponse> extends Subscriber<T>{

    private static final String TAG="BaseSubscriber";

    private SubscriberListener mBaseSubscriber;
    public BaseSubscriber(SubscriberListener baseSubscriber){
        this.mBaseSubscriber=baseSubscriber;
    }



    public void onBegin(){
        Log.i(TAG,"onbegin");
        if (mBaseSubscriber!=null){
            mBaseSubscriber.onBegin();
        }
    }

    /**
     * 为了防止可能的内存泄露，在你的 Activity 或 Fragment 的 onDestroy 里
     * 用 Subscription.isUnsubscribed() 检查你的 Subscription 是否是
     * unsubscribed。如果调用了 Subscription.unsubscribe()
     * Unsubscribing将会对 items 停止通知给你的 Subscriber，
     * 并允许垃圾回收机制释放对象，防止任何 RxJava 造成内存泄露
     * 最终要走到我们的完成中去  要不然内存有可能泄露
     */
    @Override
    public void onCompleted() {
        Log.i(TAG,"onCompleted");
        if (mBaseSubscriber!=null){
            mBaseSubscriber.onCompleted();
        }
        if (!this.isUnsubscribed()){//如果用户已取消订阅返回true 加上！false
            //请求完成了调用这个 手动的给他取消掉订阅  防止内存泄露
            this.unsubscribe();
        }
    }

    @Override
    public void onError(Throwable e) {
        Log.i(TAG,"onError");
        if (mBaseSubscriber!=null){
            mBaseSubscriber.onError(e);//gothere  nopass down
        }
        onCompleted();

    }

    @Override
    public void onNext(T response) {
        Log.i(TAG,"onNext");
        if (mBaseSubscriber!=null){
            System.out.println( "jieguoma shiming"+response.error_code);
            System.out.println( "jieguoma shiming"+response.ruselt);
            System.out.println(response.error_code==0);
            if (response.error_code==0){//结果码0  聚合数据的返回码看文档 o
                mBaseSubscriber.onSuccess(response);
            }
            // 这些返回码 都是需要和服务器 那边相对应的
            if (response.error_code==1){
                mBaseSubscriber.onFail(response.error_code+"",response.reason);
            }
            if (response.error_code==2){
                mBaseSubscriber.checkLogin(response.error_code+"",response.reason);
            }
        }

    }

}
