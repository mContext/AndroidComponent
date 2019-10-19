package com.huawei.logincomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.huawei.commlib.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public void launchLoginActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context,LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment getUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId,fragment).commit();
        return fragment;
    }
}
