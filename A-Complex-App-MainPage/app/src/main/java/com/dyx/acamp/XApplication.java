package com.dyx.acamp;

import android.app.Application;

import com.apkfuns.logutils.LogUtils;
import com.dyx.acamp.constants.Constants;
import com.dyx.acamp.di.components.DaggerMainPageComponent;
import com.dyx.acamp.di.components.DaggerNetComponent;
import com.dyx.acamp.di.components.MainPageComponent;
import com.dyx.acamp.di.components.NetComponent;
import com.dyx.acamp.di.modules.AppModule;
import com.dyx.acamp.di.modules.MainPageModule;
import com.dyx.acamp.di.modules.NetModule;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午1:33
 * alter person：dayongxin
 * alter time：16/7/15 下午1:33
 * alter remark：
 */
public class XApplication extends Application {
    private NetComponent mNetComponent;
    private MainPageComponent mMainPageComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        LogUtils.configAllowLog = true;
        LogUtils.configTagPrefix = "***A-Complex-App-MainPage***";
        mNetComponent = DaggerNetComponent.builder().appModule(new AppModule(this)).netModule(new NetModule(Constants.HOST_URL)).build();

        mMainPageComponent = DaggerMainPageComponent.builder().netComponent(mNetComponent).mainPageModule(new MainPageModule()).build();
    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }

    public MainPageComponent getmMainPageComponent() {
        return mMainPageComponent;
    }
}
