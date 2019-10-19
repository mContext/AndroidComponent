package com.huawei.minecomponent;

import android.app.Application;

import com.huawei.commlib.IAppCompat;
import com.huawei.commlib.ServiceFactory;

public class MineApplication extends Application implements IAppCompat {
    @Override
    public void init(Application application) {
        ServiceFactory.getInstance().setMineService(new MineService());
    }
}
