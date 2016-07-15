package com.dyx.acamp.view;

import android.app.Activity;
import android.os.Bundle;

import com.dyx.acamp.utils.ToastUtil;

/**
 * project name：A-Complex-App-MainPage
 * class describe：
 * create person：dayongxin
 * create time：16/7/15 下午1:37
 * alter person：dayongxin
 * alter time：16/7/15 下午1:37
 * alter remark：
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void ToastCheese(String msg) {
        ToastUtil.makeText(this, msg).show();
    }
}
