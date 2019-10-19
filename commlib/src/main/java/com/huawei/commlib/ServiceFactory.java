package com.huawei.commlib;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ILoginService mLoginService;
    private IMineService mMineService;

    public ILoginService getLoginService() {
        return null != mLoginService ? mLoginService : new EmptyLoginService();
    }

    public void setLoginService(ILoginService mILoginService) {
        this.mLoginService = mILoginService;
    }

    public IMineService getMineService() {
        return null != mMineService ? mMineService : new EmptyMineService();
    }

    public void setMineService(IMineService mIMineService) {
        this.mMineService = mIMineService;
    }
}
