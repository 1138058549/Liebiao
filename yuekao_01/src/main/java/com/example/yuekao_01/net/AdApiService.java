package com.example.yuekao_01.net;

import com.example.yuekao_01.bean.AdBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface AdApiService {
    @GET("ad/getAd")
    Observable<AdBean> getAd();
}
