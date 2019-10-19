package com.huawei.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.huawei.commlib.IMineService;

public class MineService implements IMineService {
    @Override
    public void launchMineActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, MineActivity.class);
        context.startActivity(intent);
    }
}
