package com.dyx.acamp.di.components;

import com.dyx.acamp.di.modules.AppModule;
import com.dyx.acamp.di.modules.NetModule;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Component;
import retrofit.Retrofit;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午1:55
 * alter person：dayongxin
 * alter time：16/7/15 下午1:55
 * alter remark：
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();

    OkHttpClient okHttpClient();
}
