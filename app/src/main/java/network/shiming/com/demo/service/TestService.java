package network.shiming.com.demo.service;


import java.util.ArrayList;

import network.shiming.com.demo.MainActivity;
import network.shiming.com.demo.bean.TadayBean;
import network.shiming.com.network.retrofit.SMResponse;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by shiming on 2017/4/3.
 * desc  https://www.juhe.cn/docs/api/id/63  聚合的数据接口
 * 传入的参数
 */
public interface TestService {
//未来6天预报(future)两种返回格式，1或2，默认1  num
//    返回数据格式：json或xml,默认json  http://v.juhe.cn/todayOnhistory/queryEvent.php?key=b15674dbd34ec00ded57b369dfdabd90&date=1/1
    @GET(MainActivity.uri2)
    Observable<SMResponse<ArrayList<TadayBean>>> getTaday(@Query("key") String key, @Query("date") String date);

}
