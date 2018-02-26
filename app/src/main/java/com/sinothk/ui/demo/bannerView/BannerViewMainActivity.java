package com.sinothk.ui.demo.bannerView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sinothk.ui.bannerView.Banner;
import com.sinothk.ui.demo.R;
import com.sinothk.ui.demo.mall.MallDemoMainActivity;
import com.sinothk.ui.demo.sideBar.SideBarMainActivity;

import java.util.ArrayList;
import java.util.List;

public class BannerViewMainActivity extends AppCompatActivity {
    Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banner_view_main_activity);

        banner = (Banner) findViewById(R.id.banner);

        List<BannerBean> bannerBeanList = new ArrayList<>();
        BannerBean banner1 = new BannerBean("", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2727129703,1839762678&fm=27&gp=0.jpg", 2);
        BannerBean banner2 = new BannerBean("T2", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2160694151,724894006&fm=27&gp=0.jpg", 2);
        BannerBean banner3 = new BannerBean("T3", "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1178098001,3025750323&fm=27&gp=0.jpg", 2);

        banner1.setIntent(new Intent(this, MallDemoMainActivity.class));
        banner2.setIntent(new Intent(this, SideBarMainActivity.class));

        bannerBeanList.add(banner1);
        bannerBeanList.add(banner2);
        bannerBeanList.add(banner3);

        BannerUtil.show(this, banner, bannerBeanList);
    }

    @Override
    protected void onStart() {
        super.onStart();
        BannerUtil.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        BannerUtil.stopAutoPlay();
    }
}
