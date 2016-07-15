package com.dyx.acamp.network.interfaces;

import com.dyx.acamp.models.AppMainPageModel;
import com.dyx.acamp.models.AppMainPageTop;

import retrofit.Call;
import retrofit.http.GET;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午2:04
 * alter person：dayongxin
 * alter time：16/7/15 下午2:04
 * alter remark：
 */
public interface MainPageInterface {

    /**
     * App首页布局，轮播图小图标（GetAppLayoutAmend）
     *
     * @param
     * @return
     */
    @GET("/client/v1/app/layoutamend?parameters={\"source\":\"A\",\"version\":\"4.1.1\"}")
    Call<AppMainPageTop> getMainPageTop();

    /**
     * 改版App首页货架（ActsAmend）
     *
     * @param
     * @return
     */
    @GET("/client/v1/actsamend?parameters={\"source\":\"A\",\"version\":\"4.1.1\"}")
    Call<AppMainPageModel> getMainPage();
}
