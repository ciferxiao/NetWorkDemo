package network.shiming.com.network.retrofit;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import network.shiming.com.network.BuildConfig;
import network.shiming.com.network.cookie.PersistentCookieJar;
import network.shiming.com.network.cookie.cache.SetCookieCache;
import network.shiming.com.network.cookie.persistence.SharedPrefsCookiePersistor;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by shiming on 2017/4/3.
 */
public class SMRetrofit {
    private static SMRetrofit mRetrofit;
    private  Context mContext;
    //是否https的链接
    private static  boolean mIsHttps;
    private String mServerAddressFormal;

    private static final int DEFAULT_TIMEOUT = 15;
    private OkHttpClient mClient;
    private Retrofit mBuild;

    private SMRetrofit(Context context,boolean isHttps){
        //为什么要取这个context的对象，因为这个生命周期比较短，百度
        mContext = context.getApplicationContext();
        mIsHttps = isHttps;
        initRetrofit();
    }

    private void initRetrofit() {
        //no https
        mServerAddressFormal = BuildConfig.SERVER_ADDRESS_FORMAL;
        String publishEnvironment = BuildConfig.PUBLISH_ENVIRONMENT;
        if (mIsHttps){
            //is https
            mServerAddressFormal=BuildConfig.SERVER_ADDRESS_FORMAL_S;
        }
//        if ("personal".equals(publishEnvironment)){
//            mServerAddressFormal=BuildConfig.SERVER_ADDRESS_PERSONAL;
//        }
//        initRetrofit("http://api.juheapi.com/japi/");++++
        System.out.println( " host shiming "+ mServerAddressFormal);
        initRetrofit(mServerAddressFormal);
        new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                return null;
            }
        };
    }

    private void initRetrofit(String serverAddressFormal) {
        Log.i(this.getClass().getName(),"serverAddress="+serverAddressFormal);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG){
            System.out.println( "shiming debug log");
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        }else {
            //上线  不给日记输出
            System.out.println( "shiming "+" no log");
//            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        }
        File cache = new File(mContext.getCacheDir(), "cache");
        int cacheSize=10*1024*1024;
        Cache cache1 = new Cache(cache, cacheSize);
        mClient = new OkHttpClient.Builder().cache(cache1)
//              .addInterceptor(new HeadersInterceptor(mContext))//拦截器 如果项目需要的话 如果大公司的话 该死的项目经理会要求拿到用户的手机设备的信息发布渠道的东西 ，需要这里填入
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptor)
                .cookieJar(new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(mContext)))
                .build();
        mBuild = new Retrofit.Builder()
                .baseUrl(serverAddressFormal)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(mClient)// 关联
                .build();
    }

    /**
     *
     * @param context
     * @return
     * 双重锁判断 单利
     * 由于我自己用的聚合的数据接口 我这里就默认了我这里不是https的接口
     *
     */
    public static SMRetrofit getInstance(Context context){
        if (mRetrofit==null||mIsHttps){
            synchronized (SMRetrofit.class){
                if (mRetrofit==null||mIsHttps){
                    mRetrofit=new SMRetrofit(context,false);
                }
            }
        }
        return mRetrofit;
    }
    public static SMRetrofit getInstance(Context context,boolean isHttps){
        if (mRetrofit==null||isHttps){
            synchronized (SMRetrofit.class){
                if (mRetrofit==null||isHttps){
                    mRetrofit=new SMRetrofit(context,isHttps);
                }
            }
        }
        return mRetrofit;
    }

    /**
     *
     * @return 真正的retorfit在这里
     */
    public Retrofit getBuild(){
        return mBuild;
    }

    /**
     *
     * @param context
     * @param servcie 真正的service在这里
     * @param <T>
     * @return
     */
    public static <T> T getService(Context context,Class<T> servcie){
        return SMRetrofit.getInstance(context).getBuild().create(servcie);
    }
}
