package com.example.yuekao_01;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.yuekao_01.homepage.FragmentHome;
import com.example.yuekao_01.my.FragmentMy;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 首页
     */
    private RadioButton mRbHomepage;
    /**
     * 音乐
     */
    private RadioButton mRbShopCar;
    /**
     * 我的
     */
    private RadioButton mRbMine;
    private RadioGroup mRg;
    private FrameLayout mFlContent;
    private FragmentHome fragmentHome;
    private FragmentManager fragmentManager;
    private FragmentMy fragmentMy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        fragmentHome = new FragmentHome();
        fragmentMy = new FragmentMy();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent,fragmentHome).commit();
    }

    private void initView() {
        mRbHomepage = (RadioButton) findViewById(R.id.rbHomepage);
        mRbHomepage.setOnClickListener(this);
        mRbShopCar = (RadioButton) findViewById(R.id.rbShopCar);
        mRbShopCar.setOnClickListener(this);
        mRbMine = (RadioButton) findViewById(R.id.rbMine);
        mRbMine.setOnClickListener(this);
        mRg = (RadioGroup) findViewById(R.id.rg);
        mFlContent = (FrameLayout) findViewById(R.id.flContent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.rbHomepage:
                fragmentManager.beginTransaction().replace(R.id.flContent,fragmentHome).commit();
                break;
            case R.id.rbShopCar:
                break;
            case R.id.rbMine:
                fragmentManager.beginTransaction().replace(R.id.flContent,fragmentMy).commit();
                break;
        }
    }
}
