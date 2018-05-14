package network.shiming.com.network.down_load;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import rx.Observable;

/**
 * author： Created by shiming on 2018/5/11 10:04
 * mailbox：lamshiming@sina.com
 */

public interface DownloadService {

    @Streaming
    @GET
    Observable<ResponseBody> download(@Url String url);

}