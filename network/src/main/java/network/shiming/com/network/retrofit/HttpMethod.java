package network.shiming.com.network.retrofit;


import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

/**
 * Created by shiming on 2017/4/3.
 * RxJava最核心的两个东西是Observables（被观察者，事件源）
 * 和Subscribers（订阅者）。Observables发出一系列事件，
 * Subscribers处理这些事件
 */
public class HttpMethod {
    // 这个可以处理一个app中大多的网络请求了
    public static <T extends SMResponse> void toSubscribe(Observable<T> observable, final BaseSubscriber<T> baseSubscriber) {
        observable.subscribeOn(Schedulers.io())
                .retryWhen(new RetryWhenHandler(1, 5))//chongxin lianjie
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        baseSubscriber.onBegin();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(baseSubscriber);//绑定订阅者
    }
    // 多个数据流，整合多个数据流的方法 调用  在第一版本 我先不讲这个这么用  如果有合适的接口调用
//    我会把这个讲讲怎么用
//    public static <T> Observable.Transformer<T, T> defaultHandler() {
//        return new Observable.Transformer<T, T>() {
//            @Override
//            public Observable<T> call(Observable<T> observable) {
//                return observable
//                        .subscribeOn(Schedulers.io())
//                        .retryWhen(new RetryWhenHandler(1, 5))
//                        .unsubscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread());
//            }
//        };
//    }
}
