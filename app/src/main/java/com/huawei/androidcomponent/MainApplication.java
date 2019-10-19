package com.huawei.androidcomponent;

import android.app.Application;

import com.huawei.commlib.AppConfig;
import com.huawei.commlib.IAppCompat;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Login以及mine组件里的service
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppCompat) {
                    ((IAppCompat) object).init(this);
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
