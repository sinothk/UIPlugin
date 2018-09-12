package com.sinothk.ui.demo.switchButton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sinothk.ui.demo.R;
import com.sinothk.ui.switchButton.SwitchButton;

public class SwitchButtonMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_button_activity_main);

        SwitchButton switchButton = (SwitchButton) findViewById(R.id.switch_button);
        switchButton.setChecked(true);
        switchButton.isChecked();
        switchButton.toggle();     //switch state
        switchButton.toggle(false);//switch without animation
        switchButton.setShadowEffect(true);//disable shadow effect
        switchButton.setEnabled(false);//disable button
        switchButton.setEnableEffect(false);//disable the switch animation
        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
//                OToastUtil.show("isChecked = " + isChecked);
            }
        });
    }
}
