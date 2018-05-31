package com.example.yuekao_01.homepage.presenter;

import com.example.yuekao_01.base.BasePresenter;
import com.example.yuekao_01.bean.AdBean;
import com.example.yuekao_01.homepage.contract.HomPageContract;
import com.example.yuekao_01.net.AdApi;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HomePagePresenter extends BasePresenter<HomPageContract.View> implements HomPageContract.Presenter{
    private AdApi adApi;


    @Inject
    public HomePagePresenter(AdApi adApi) {
        this.adApi = adApi;

    }
    @Override
    public void getAd() {
        adApi.getAd()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<AdBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AdBean adBean) {
                        mView.getAdSuccess(adBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
