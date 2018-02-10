package com.sinothk.ui.demo.mall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.sinothk.ui.demo.R;
import com.sinothk.ui.mall.MallDetailView;
import com.sinothk.ui.switchMultiButton.SwitchMultiButton;
import com.sinothk.utils.OToastUtil;
import com.sinothk.utils.OUtil;

import java.util.Arrays;
import java.util.List;

public class MallDemoMainActivity extends AppCompatActivity {

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

        MallDetailView mallDetailView = (MallDetailView) this.findViewById(R.id.mallDetailView);
        mallDetailView.setImgUrls(urls);
        mallDetailView.setImgUrls(Arrays.asList(urls));
        mallDetailView.setOnImgLongClickListener(new MallDetailView.OnImgLongClickListener() {
            @Override
            public void imgLongClick(int position, String imgUrl) {
                OUtil.init(getApplicationContext());
                OToastUtil.show("p = " + position + ", url = " + imgUrl);
            }
        });
    }
}
