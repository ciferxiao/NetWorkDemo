package network.shiming.com.network.down_load;

/**
 * author： Created by shiming on 2018/5/11 09:58
 * mailbox：lamshiming@sina.com
 */

public interface DownloadProgressListener {
    void update(long bytesRead, long contentLength, boolean done);
}
