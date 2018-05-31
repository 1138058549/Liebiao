package com.example.yuekao_01.base;

import android.view.View;

public interface IBase {
    int getContentLayout();

    void inject();

    void initView(View view);
}
