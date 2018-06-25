package com.abt.anr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * activity5秒没有影响触屏或者按键操作，报anr
 * broadcast10秒没有影响触屏或者按键操作，报anr
 * service20秒没有影响触屏或者按键操作，报anr
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SystemClock.sleep(8*1000); // 另种sleep都会导致anr
        try {
            Thread.sleep(8*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
