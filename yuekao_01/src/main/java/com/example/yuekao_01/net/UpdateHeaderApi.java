package com.example.yuekao_01.net;

import com.example.yuekao_01.bean.BaseBean;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class UpdateHeaderApi {
    private static UpdateHeaderApi updateHeaderApi;
    private UpdateHeaderApiService updateHeaderApiService;

    private UpdateHeaderApi(UpdateHeaderApiService updateHeaderApiService) {
        this.updateHeaderApiService = updateHeaderApiService;
    }

    public static UpdateHeaderApi getUpdateHeaderApi(UpdateHeaderApiService updateHeaderApiService) {
        if (updateHeaderApi == null) {
            updateHeaderApi = new UpdateHeaderApi(updateHeaderApiService);
        }
        return updateHeaderApi;
    }

    public Observable<BaseBean> updateHeader(RequestBody uid, MultipartBody.Part file) {
        return updateHeaderApiService.updateHeader(uid, file);
    }
}
