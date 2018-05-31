package com.example.yuekao_01.my.contract;

import com.example.yuekao_01.base.BaseContract;

public interface UpdateHeaderContract {
    interface View extends BaseContract.BaseView{
        void updateSuccess(String code);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void updateHeader(String uid, String filePath);
    }

}