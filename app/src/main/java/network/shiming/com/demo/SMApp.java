package network.shiming.com.demo;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

/**
 * Created by shiming on 2017/4/9.
 */
public class SMApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
//					.threadPoolSize(3)
                .memoryCacheExtraOptions(280, 280)
//					.discCacheExtraOptions(280, 280, CompressFormat.JPEG, 75, null)
                .threadPriority(Thread.NORM_PRIORITY)
                .denyCacheImageMultipleSizesInMemory()
//					.discCacheFileNameGenerator(new Md5FileNameGenerator())
//					.discCache(new LimitedAgeDiscCache(StorageUtils.getCacheDirectory(context),new Md5FileNameGenerator(), discCacheLimitTime))
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .build();
        ImageLoader.getInstance().init(config);

    }
}
