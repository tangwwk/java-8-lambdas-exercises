package guava;

import com.google.common.base.Optional;
import com.google.common.cache.*;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by tangww on 2017-05-08.
 */
public class GuavaCallableCache {

    public static void main(String[] args) {
        final String key = "github";
        Cache<String, Optional<String>> cache = CacheBuilder.newBuilder()
                .expireAfterWrite(3, TimeUnit.SECONDS)
                .removalListener(new RemovalListener<String, Optional<String>>() {
                    @Override
                    public void onRemoval(RemovalNotification<String, Optional<String>> notification) {
                        System.out.println("cache expired, remove key : " + notification.getKey());
                    }
                }).build();
        try {
            Optional<String> optional;
            System.out.println("load from cache once : " + cache.get(key, new Callable<Optional<String>>() {
                @Override
                public Optional<String> call() throws Exception {
                    return Optional.fromNullable(MockDB.loadFromPersistence(key));
                }
            }).orNull());
            Thread.sleep(2000);
            System.out.println("load from cache twice : " + cache.get(key, new Callable<Optional<String>>() {
                @Override
                public Optional<String> call() throws Exception {
                    return Optional.fromNullable(MockDB.loadFromPersistence(key));
                }
            }).orNull());
            Thread.sleep(2000);
            System.out.println("load from cache third : " + cache.get(key, new Callable<Optional<String>>() {
                @Override
                public Optional<String> call() throws Exception {
                    return Optional.fromNullable(MockDB.loadFromPersistence(key));
                }
            }).orNull());
            Thread.sleep(2000);
            final String nullKey = "email";
            optional = cache.get(nullKey, new Callable<Optional<String>>() {
                @Override
                public Optional<String> call() throws Exception {
                    return Optional.fromNullable(MockDB.loadFromPersistence(nullKey));
                }
            });
            System.out.println("load not exist key from cache : " + optional.orNull());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
