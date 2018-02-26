package com.sinothk.ui.bannerView;

import android.support.v4.view.ViewPager.PageTransformer;

import com.sinothk.ui.bannerView.transformer.AccordionTransformer;
import com.sinothk.ui.bannerView.transformer.BackgroundToForegroundTransformer;
import com.sinothk.ui.bannerView.transformer.CubeInTransformer;
import com.sinothk.ui.bannerView.transformer.CubeOutTransformer;
import com.sinothk.ui.bannerView.transformer.DefaultTransformer;
import com.sinothk.ui.bannerView.transformer.DepthPageTransformer;
import com.sinothk.ui.bannerView.transformer.FlipHorizontalTransformer;
import com.sinothk.ui.bannerView.transformer.FlipVerticalTransformer;
import com.sinothk.ui.bannerView.transformer.ForegroundToBackgroundTransformer;
import com.sinothk.ui.bannerView.transformer.RotateDownTransformer;
import com.sinothk.ui.bannerView.transformer.RotateUpTransformer;
import com.sinothk.ui.bannerView.transformer.ScaleInOutTransformer;
import com.sinothk.ui.bannerView.transformer.StackTransformer;
import com.sinothk.ui.bannerView.transformer.TabletTransformer;
import com.sinothk.ui.bannerView.transformer.ZoomInTransformer;
import com.sinothk.ui.bannerView.transformer.ZoomOutSlideTransformer;
import com.sinothk.ui.bannerView.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
