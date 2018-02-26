package com.sinothk.ui.demo.bannerView;

import android.content.Intent;

/**
 * <pre>
 *  创建:  梁玉涛 2018/2/26/026 on 14:06
 *  项目: BannerView
 *  描述:
 *  更新:
 * <pre>
 */
public class BannerBean {
    private String title;
    private String img;
    private int whRatio;
    private Intent intent;

    public BannerBean() {
    }

    public BannerBean(String img) {
        this.img = img;
    }

    public BannerBean(String img, int whRatio) {
        this.img = img;
        this.whRatio = whRatio;
    }

    public BannerBean(String title, String img, int whRatio) {
        this.title = title;
        this.img = img;
        this.whRatio = whRatio;
    }

    public BannerBean(String img, Intent intent) {
        this.img = img;
        this.whRatio = whRatio;
        this.intent = intent;
    }

    public BannerBean(String img, int whRatio, Intent intent) {
        this.img = img;
        this.whRatio = whRatio;
        this.intent = intent;
    }

    public BannerBean(String title, String img, int whRatio, Intent intent) {
        this.title = title;
        this.img = img;
        this.whRatio = whRatio;
        this.intent = intent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getWhRatio() {
        return whRatio;
    }

    public void setWhRatio(int whRatio) {
        this.whRatio = whRatio;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }
}
