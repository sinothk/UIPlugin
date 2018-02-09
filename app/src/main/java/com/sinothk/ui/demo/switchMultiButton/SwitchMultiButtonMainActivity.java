package com.sinothk.ui.demo.switchMultiButton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sinothk.ui.demo.R;
import com.sinothk.ui.switchMultiButton.SwitchMultiButton;

public class SwitchMultiButtonMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_multi_button_activity_main);

        //set switch tabs with ***app:switchTabs*** in xml
        SwitchMultiButton switchmultibutton = (SwitchMultiButton) findViewById(R.id.switchmultibutton);
        switchmultibutton.setOnSwitchListener(new SwitchMultiButton.OnSwitchListener() {
            @Override
            public void onSwitch(int position, String tabText) {
                Toast.makeText(SwitchMultiButtonMainActivity.this, tabText, Toast.LENGTH_SHORT).show();
            }
        });

        //or set switch tabs in java code
        SwitchMultiButton mSwitchMultiButton2 = (SwitchMultiButton) findViewById(R.id.switchmultibutton2);
        mSwitchMultiButton2.setText("点个Star", "狠心拒绝").setOnSwitchListener(new SwitchMultiButton.OnSwitchListener() {
            @Override
            public void onSwitch(int position, String tabText) {
                Toast.makeText(SwitchMultiButtonMainActivity.this, tabText, Toast.LENGTH_SHORT).show();
            }
        });

//        mSwitchMultiButton.setSelectedTab(0);
    }
}
