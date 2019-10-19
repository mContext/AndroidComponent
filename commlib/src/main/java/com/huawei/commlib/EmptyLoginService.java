package com.huawei.commlib;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class EmptyLoginService implements ILoginService {
    @Override
    public void launchLoginActivity(Context context) {

    }

    @Override
    public Fragment getUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
