package com.dyx.acamp.di.modules;

import android.app.Application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午1:57
 * alter person：dayongxin
 * alter time：16/7/15 下午1:57
 * alter remark：
 */
@Module
public class NetModule {
    String hostUrl;

    public NetModule(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    /**
     * OkHttpCache
     *
     * @param application
     * @return
     */
    @Provides
    @Singleton
    Cache providesOkHttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024; // 10 MiB
        Cache cache = new Cache(application.getCacheDir(), cacheSize);
        return cache;
    }

    /**
     * Gson
     *
     * @return
     */
    @Provides
    @Singleton
    Gson providesGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

    /**
     * OkHttpClient
     *
     * @param cache
     * @return
     */
    @Provides
    @Singleton
    OkHttpClient providesOkHttpClient(Cache cache) {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setCache(cache);
        return okHttpClient;
    }


    @Provides
    @Singleton
    Retrofit providesRetrofit(Gson gson, OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(hostUrl)
                .client(okHttpClient)
                .build();
        return retrofit;
    }
}
