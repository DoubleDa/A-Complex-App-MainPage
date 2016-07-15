package com.dyx.acamp.view.ui;

import android.os.Bundle;

import com.apkfuns.logutils.LogUtils;
import com.dyx.acamp.R;
import com.dyx.acamp.XApplication;
import com.dyx.acamp.models.AppMainPageModel;
import com.dyx.acamp.models.AppMainPageTop;
import com.dyx.acamp.network.interfaces.MainPageInterface;
import com.dyx.acamp.view.BaseActivity;
import com.dyx.acamp.view.adapter.MainPageAdapter;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import butterknife.ButterKnife;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午1:38
 * alter person：dayongxin
 * alter time：16/7/15 下午1:38
 * alter remark：
 */
public class MainPageAct extends BaseActivity {

    @Inject
    Retrofit mRetrofit;

    @Inject
    MainPageInterface mMainPageInterface;


    private MainPageAdapter mMainPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((XApplication) getApplication()).getmMainPageComponent().inject(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        /**
         * 顶部信息
         */
        fatchTopDataFromServer();
        /**
         * 虾面信息
         */
        //fatchDataFromServer();
    }

    private void fatchTopDataFromServer() {
        Call<AppMainPageTop> call = mMainPageInterface.getMainPageTop();

        call.enqueue(new Callback<AppMainPageTop>() {
            @Override
            public void onResponse(Response<AppMainPageTop> response, Retrofit retrofit) {
                if (response.isSuccess()) {
                    AppMainPageTop appMainPageTop = response.body();
                    AppMainPageTop.DataEntity dataEntity = appMainPageTop.getData();
                    LogUtils.i(dataEntity.getCarousel());
                } else {
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    private void fatchDataFromServer() {
        Call<AppMainPageModel> call = mMainPageInterface.getMainPage();

        call.enqueue(new Callback<AppMainPageModel>() {
            @Override
            public void onResponse(Response<AppMainPageModel> response, Retrofit retrofit) {
                if (response.isSuccess()) {
                    AppMainPageModel appMainPageModel = response.body();
                    AppMainPageModel.DataEntity dataEntity = appMainPageModel.getData();
                    LogUtils.i("Main|" + dataEntity.getActs().size());
                } else {
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
