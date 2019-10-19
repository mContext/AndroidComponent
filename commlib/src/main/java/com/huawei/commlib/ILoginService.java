package com.huawei.commlib;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public interface ILoginService {
    void launchLoginActivity(Context context);
    Fragment getUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
