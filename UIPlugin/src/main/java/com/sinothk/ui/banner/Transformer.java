package com.sinothk.ui.banner;

import android.support.v4.view.ViewPager.PageTransformer;

import com.sinothk.ui.banner.transformer.AccordionTransformer;
import com.sinothk.ui.banner.transformer.BackgroundToForegroundTransformer;
import com.sinothk.ui.banner.transformer.CubeInTransformer;
import com.sinothk.ui.banner.transformer.CubeOutTransformer;
import com.sinothk.ui.banner.transformer.DefaultTransformer;
import com.sinothk.ui.banner.transformer.DepthPageTransformer;
import com.sinothk.ui.banner.transformer.FlipHorizontalTransformer;
import com.sinothk.ui.banner.transformer.FlipVerticalTransformer;
import com.sinothk.ui.banner.transformer.ForegroundToBackgroundTransformer;
import com.sinothk.ui.banner.transformer.RotateDownTransformer;
import com.sinothk.ui.banner.transformer.RotateUpTransformer;
import com.sinothk.ui.banner.transformer.ScaleInOutTransformer;
import com.sinothk.ui.banner.transformer.StackTransformer;
import com.sinothk.ui.banner.transformer.TabletTransformer;
import com.sinothk.ui.banner.transformer.ZoomInTransformer;
import com.sinothk.ui.banner.transformer.ZoomOutSlideTransformer;
import com.sinothk.ui.banner.transformer.ZoomOutTranformer;

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
