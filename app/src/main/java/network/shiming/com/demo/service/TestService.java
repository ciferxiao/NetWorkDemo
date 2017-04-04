package network.shiming.com.demo.service;


import java.util.ArrayList;

import network.shiming.com.demo.MainActivity;
import network.shiming.com.demo.bean.MuerDataBean;
import network.shiming.com.demo.bean.TadayBean;
import network.shiming.com.demo.bean.TestBeanDemo;
import network.shiming.com.network.retrofit.SMResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by shiming on 2017/4/3.
 */
public interface TestService {
//未来6天预报(future)两种返回格式，1或2，默认1  num
//    返回数据格式：json或xml,默认json
    @GET(MainActivity.uri)
    Observable<SMResponse<TestBeanDemo>> getData(@Query("cityname") String cityname
    , @Query("key") String key
    );

//    http://apis.juhe.cn/cook/query.php  后面创建URI去管理最好
    @GET(MainActivity.uricai)
    Observable<SMResponse<MuerDataBean>> getCai(@Query("menu") String menu ,@Query("key") String key
    );

    @GET(MainActivity.uri2)
    Observable<SMResponse<ArrayList<TadayBean>>> getTaday(@Query("key") String key, @Query("v") String menu , @Query("month") int month
    , @Query("day") int day
     );


//     Observable<SMResponse<TestBean>> getData(@Query("cityname") String cityname
//    , @Query("dtype") String json, @Query("format") int num,@Query("key") String key
//    );

}
