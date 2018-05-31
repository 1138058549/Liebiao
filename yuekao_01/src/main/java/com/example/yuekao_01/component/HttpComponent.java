package com.example.yuekao_01.component;

import com.example.yuekao_01.homepage.FragmentHome;
import com.example.yuekao_01.module.HttpModule;
import com.example.yuekao_01.my.FragmentMy;

import dagger.Component;
import dagger.Module;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(FragmentHome fragmentHome);

    void inject(FragmentMy fragmentMy);
}
