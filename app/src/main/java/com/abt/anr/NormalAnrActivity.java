package com.abt.anr;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/**
 * @描述： @NormalAnrActivity
 * @作者： @黄卫旗
 * @创建时间： @25/06/2018
 */
public class NormalAnrActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                testANR();
            }
        }).start();

        SystemClock.sleep(10);
        initView();
    }

    private synchronized void testANR() {
        SystemClock.sleep(18*1000);
    }

    private synchronized void initView() {

    }
}
