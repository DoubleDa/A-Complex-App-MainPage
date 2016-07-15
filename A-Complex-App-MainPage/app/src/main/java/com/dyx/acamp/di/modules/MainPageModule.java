package com.dyx.acamp.di.modules;

import com.dyx.acamp.di.scopes.MainPageScope;
import com.dyx.acamp.network.interfaces.MainPageInterface;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午2:03
 * alter person：dayongxin
 * alter time：16/7/15 下午2:03
 * alter remark：
 */
@Module
public class MainPageModule {
    @Provides
    @MainPageScope
    public MainPageInterface providesMainPageInterface(Retrofit retrofit){
        return retrofit.create(MainPageInterface.class);
    }
}
