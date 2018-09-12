package com.sinothk.ui.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sinothk.ui.demo.bannerView.BannerViewMainActivity;
import com.sinothk.ui.demo.mall.MallDemoImageViewMainActivity;
import com.sinothk.ui.demo.roundedImage.RoundedImageDemoActivity;
import com.sinothk.ui.demo.sideBar.SideBarDemoMainActivity;
import com.sinothk.ui.demo.switchButton.SwitchButtonMainActivity;
import com.sinothk.ui.demo.tab.switchTab.lv1.SwitchTabDemoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoSwitchButtonMainActivity(View view) {
        startActivity(new Intent(this, SwitchButtonMainActivity.class));
    }

    public void gotoSwitchTabDemoActivity(View view) {
        startActivity(new Intent(this, SwitchTabDemoActivity.class));
    }

    public void gotoMallDetailImageView(View view) {
        startActivity(new Intent(this, MallDemoImageViewMainActivity.class));
    }

    public void gotoBannerViewMainActivity(View view) {
        startActivity(new Intent(this, BannerViewMainActivity.class));
    }


    public void gotoSideBarDemoMainActivity(View view) {
        startActivity(new Intent(this, SideBarDemoMainActivity.class));
    }

    public void gotoRoundedImageDemoActivity(View view) {
        startActivity(new Intent(this, RoundedImageDemoActivity.class));
    }
}
