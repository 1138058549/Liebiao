package com.example.yuekao_01.homepage.contract;

import com.example.yuekao_01.base.BaseContract;
import com.example.yuekao_01.bean.AdBean;

public interface HomPageContract {
    interface View extends BaseContract.BaseView {
        void getAdSuccess(AdBean adBean);

    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getAd();

    }
}
