package com.example.mytuomap.common;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by Totem on 2016/7/21.
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
        SDKInitializer.initialize(this);
    }
}