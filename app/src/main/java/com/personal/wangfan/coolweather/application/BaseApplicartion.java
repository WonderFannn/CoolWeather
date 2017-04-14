package com.personal.wangfan.coolweather.application;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by wangfan on 2017/4/14.
 */

public class BaseApplicartion extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePal.initialize(context);
        super.onCreate();
    }

    public static Context getContext(){
        return context;
    }
}
