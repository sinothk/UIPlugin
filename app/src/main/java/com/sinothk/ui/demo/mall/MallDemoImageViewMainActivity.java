package com.sinothk.ui.demo.mall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sinothk.ui.demo.R;
import com.sinothk.ui.mall.MallDetailImageView;

import java.util.Arrays;

public class MallDemoImageViewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mall_demo_activity_main);

        String[] urls = {
                "https://img.alicdn.com/imgextra/i4/113462038/TB2y0NFfMLD8KJjSszeXXaGRpXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i4/113462038/TB2rbXYfL6H8KJjSspmXXb2WXXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i4/113462038/TB2rbXYfL6H8KJjSspmXXb2WXXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i2/113462038/TB2NUXDfRDH8KJjSspnXXbNAVXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i2/113462038/TB2NUXDfRDH8KJjSspnXXbNAVXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i4/113462038/TB2rENDfRTH8KJjy0FiXXcRsXXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i2/113462038/TB2ZZNwfL2H8KJjy0FcXXaDlFXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i1/113462038/TB2rmRSfPnD8KJjSspbXXbbEXXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i2/113462038/TB2rupFfMLD8KJjSszeXXaGRpXa_!!113462038.jpg"

        };

        MallDetailImageView mallDetailImageView = (MallDetailImageView) this.findViewById(R.id.mallDetailView);
        mallDetailImageView.setImgUrls(urls);
        mallDetailImageView.setImgUrls(Arrays.asList(urls));
        mallDetailImageView.setOnImgLongClickListener(new MallDetailImageView.OnImgLongClickListener() {
            @Override
            public void imgLongClick(int position, String imgUrl) {
                Log.e("MallDemoImageView",imgUrl);
            }
        });
    }
}
