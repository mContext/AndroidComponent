package com.huawei.logincomponent;

import android.app.Application;

import com.huawei.commlib.IAppCompat;
import com.huawei.commlib.ServiceFactory;

public class LoginApplication extends Application implements IAppCompat {

    private static Application application  = getApplication();

    public static Application getApplication() {
        return application;
    }

    @Override
    public void init(Application app) {
        application = app;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
