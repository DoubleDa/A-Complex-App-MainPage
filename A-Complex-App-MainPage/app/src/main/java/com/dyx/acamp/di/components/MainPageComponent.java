package com.dyx.acamp.di.components;

import com.dyx.acamp.di.modules.MainPageModule;
import com.dyx.acamp.di.scopes.MainPageScope;
import com.dyx.acamp.view.ui.MainPageAct;

import dagger.Component;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午1:55
 * alter person：dayongxin
 * alter time：16/7/15 下午1:55
 * alter remark：
 */
@MainPageScope
@Component(dependencies = NetComponent.class, modules = MainPageModule.class)
public interface MainPageComponent {
    void inject(MainPageAct act);
}
