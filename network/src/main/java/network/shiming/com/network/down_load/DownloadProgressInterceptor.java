package network.shiming.com.network.down_load;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * author： Created by shiming on 2018/5/11 10:05
 * mailbox：lamshiming@sina.com
 */

public class DownloadProgressInterceptor implements Interceptor {

    private DownloadProgressListener listener;

    public DownloadProgressInterceptor(DownloadProgressListener listener) {
        this.listener = listener;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

        return originalResponse.newBuilder()
                .body(new DownloadProgressResponseBody(originalResponse.body(), listener))
                .build();
    }
}