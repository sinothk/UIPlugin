package com.sinothk.ui.demo.switchButton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sinothk.ui.demo.R;
import com.sinothk.ui.switchButton.SwitchButton;
import com.sinothk.utils.OStringUtil;
import com.sinothk.utils.OToastUtil;
import com.sinothk.utils.OUtil;

public class SwitchButtonMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_button_activity_main);

        OUtil.init(this);

        SwitchButton switchButton = (SwitchButton) findViewById(R.id.switch_button);
//        switchButton.setChecked(true);
//        switchButton.isChecked();
//        switchButton.toggle();     //switch state
//        switchButton.toggle(false);//switch without animation
//        switchButton.setShadowEffect(true);//disable shadow effect
//        switchButton.setEnabled(false);//disable button
//        switchButton.setEnableEffect(false);//disable the switch animation
        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                //TODO do your job
                OToastUtil.show("isChecked = " + isChecked);
            }
        });
    }
}
