package guava;

import com.google.common.base.Optional;
import com.google.common.cache.*;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by tangww on 2017-05-08.
 */
public class GuavaLoadingCache {
    public static void main(String[] args) {
        LoadingCache<String, Optional<String>> loadingCache = CacheBuilder
                .newBuilder()
                .expireAfterWrite(3, TimeUnit.SECONDS)//定义缓存3秒过期
                .removalListener(new RemovalListener<String, Optional<String>>() {
                    @Override
                    public void onRemoval(RemovalNotification<String, Optional<String>> notification) { //用来监听当缓存里面的key被移除时候触发的事件
                        System.out.println("cache expired, remove key : " + notification.getKey());
                    }
                })
                .build(new CacheLoader<String, Optional<String>>() {//传入一个CacheLoader类，指定缓存中没有的时候调用如下方法.
                    @Override
                    public Optional<String> load(String key) throws Exception {//当CacheLoader尝试获取数据库中不存在的数据会抛出异常，所以我们这里使用Optional可空对象处理一下。
                        return Optional.fromNullable(MockDB.loadFromPersistence(key));
                    }
                });
        try {
            System.out.println("load from cache once : " + loadingCache.get("github").orNull());
            Thread.sleep(2000);
            System.out.println("load from cache twice : " + loadingCache.get("github").orNull());
            Thread.sleep(2000);
            System.out.println("load from cache third : " + loadingCache.get("github").orNull());
            Thread.sleep(2000);
            System.out.println("load not exist key from cache : " + loadingCache.get("email").orNull());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
