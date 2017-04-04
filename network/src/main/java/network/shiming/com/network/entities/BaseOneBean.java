package network.shiming.com.network.entities;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * Created by shiming on 2017/4/3.
 * 保证一个类的唯一     子类自需要重写一个 uniquekey的方法 ，就可以了
 * 为什么呢 ？ 有时候  我们传入是对象  ，我们只需要一个对象的值
 * 但是要保证我们的对象是同一个的对象  so  你懂得
 */
public abstract class BaseOneBean implements Serializable{
    @Override
    public int hashCode() {
        String[] uniqueKey = uniqueKey();
        if (uniqueKey != null && uniqueKey.length > 0) {
            int result = 0;
            for (int i = 0; i < uniqueKey.length; i++) {
                String unique = uniqueKey[i];
                if (!TextUtils.isEmpty(unique)) {
                    result = 31 * result + unique.hashCode();
                }
            }
            if (result == 0) {
                return super.hashCode();
            } else {
                return result;
            }
        } else {
            return super.hashCode();
        }

    }

    public abstract String[] uniqueKey() ;

    @Override
    public boolean equals(Object o) {
        String[] uniqueKey = uniqueKey();
        if (uniqueKey != null && uniqueKey.length > 0) {
            BaseOneBean user = (BaseOneBean) o;
            String[] modelKey = user.uniqueKey();
            for (int i = 0; i < uniqueKey.length; i++) {
                String unique = uniqueKey[i];
                if (TextUtils.isEmpty(unique) || !unique.equals(modelKey[i])) {
                    return super.equals(o);
                }
            }
            return true;
        } else {
            return super.equals(o);
        }
    }
}
