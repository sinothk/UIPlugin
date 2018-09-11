package com.sinothk.ui.mall;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.sinothk.utils.OStringUtil;

import java.util.List;

/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/2/10 10:01
 *  @Project: UIPluginLib
 *  @Description: 商城中，产品详情介绍
 *  @Update:
 * <pre>
 */
public class MallDetailImageView extends LinearLayout {

    private OnImgLongClickListener onImgLongClickListener;

    public MallDetailImageView(Context context) {
        super(context);
    }

    public MallDetailImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public MallDetailImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MallDetailImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * urls 为List形式
     *
     * @param urls
     */
    public void setImgUrls(List<String> urls) {
        if (urls == null || urls.size() == 0) {
            return;
        }
        setImgUrls((String[]) urls.toArray());
    }

    /**
     * urls 为数组形式
     *
     * @param urls
     */
    public void setImgUrls(final String[] urls) {
        if (urls == null || urls.length == 0) {
            return;
        }

        for (int i = 0; i < urls.length; i++) {

            if (OStringUtil.isEmpty(urls[i])) {
                continue;
            }

            final int position = i;
            final String url = urls[i];

            ImageView myImageView = new ImageView(this.getContext());
            myImageView.setScaleType(ImageView.ScaleType.CENTER);
            myImageView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
            myImageView.setAdjustViewBounds(true);

            Glide.with(this.getContext())
                    .load(url)
//                    .placeholder(R.drawable.loading_spinner)
                    .into(myImageView);

            myImageView.setOnLongClickListener(new OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if (onImgLongClickListener != null) {
                        onImgLongClickListener.imgLongClick(position, url);
                    }

                    return false;
                }
            });

            this.addView(myImageView);
        }
    }

    /**
     * 图片长按监听事件
     *
     * @param onImgLongClickListener
     */
    public void setOnImgLongClickListener(OnImgLongClickListener onImgLongClickListener) {
        this.onImgLongClickListener = onImgLongClickListener;
    }

    public interface OnImgLongClickListener {
        void imgLongClick(int position, String imgUrl);
    }
}
