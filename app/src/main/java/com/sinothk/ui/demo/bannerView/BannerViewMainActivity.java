package com.sinothk.ui.demo.bannerView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sinothk.ui.banner.BannerView;
import com.sinothk.ui.banner.ext.BannerBean;
import com.sinothk.ui.banner.ext.BannerUtil;
import com.sinothk.ui.demo.R;
import com.sinothk.ui.demo.mall.MallDemoMainActivity;
import com.sinothk.ui.demo.sideBar.SideBarMainActivity;
import com.sinothk.ui.demo.switchButton.SwitchButtonMainActivity;

import java.util.ArrayList;
import java.util.List;

public class BannerViewMainActivity extends AppCompatActivity {
    BannerView banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banner_view_main_activity);

        banner = (BannerView) findViewById(R.id.banner);

        List<BannerBean> bannerBeanList = new ArrayList<>();
        BannerBean banner1 = new BannerBean("", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2727129703,1839762678&fm=27&gp=0.jpg", 2);
        BannerBean banner2 = new BannerBean("T2", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2160694151,724894006&fm=27&gp=0.jpg", 2);
        BannerBean banner3 = new BannerBean("T3", "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1178098001,3025750323&fm=27&gp=0.jpg", 2);

        banner1.setIntent(new Intent(this, MallDemoMainActivity.class));
        banner2.setIntent(new Intent(this, SideBarMainActivity.class));

        banner3.setIntent(new Intent(this, SwitchButtonMainActivity.class));

        bannerBeanList.add(banner1);
        bannerBeanList.add(banner2);
        bannerBeanList.add(banner3);

        BannerUtil.show(this, banner, bannerBeanList);

        // =======================原版=================================
//        Banner banner = (Banner) findViewById(R.id.banner);
//        //设置banner样式
//        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
//        //设置图片加载器
//        banner.setImageLoader(new GlideImageLoader());
//        //设置图片集合
//        banner.setImages(images);
//        //设置banner动画效果
//        banner.setBannerAnimation(Transformer.DepthPage);
//        //设置标题集合（当banner样式有显示title时）
//        banner.setBannerTitles(titles);
//        //设置自动轮播，默认为true
//        banner.isAutoPlay(true);
//        //设置轮播时间
//        banner.setDelayTime(1500);
//        //设置指示器位置（当banner模式中有指示器时）
//        banner.setIndicatorGravity(BannerConfig.CENTER);
//        //banner设置方法全部调用完毕时最后调用
//        banner.start();
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
