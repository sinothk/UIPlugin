package com.sinothk.ui.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sinothk.utils.OStringUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OStringUtil.getNotNullValue("");
    }
}
