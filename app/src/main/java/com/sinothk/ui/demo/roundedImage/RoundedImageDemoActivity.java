package com.sinothk.ui.demo.roundedImage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.sinothk.ui.demo.R;
import com.sinothk.ui.imageView.roundedImage.RoundedImageView;

public class RoundedImageDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rounded_image_demo);

        RoundedImageView imageView1 = findViewById(R.id.imageView1);

        Glide.with(this).load("http://p0.so.qhimgs1.com/dmfd/235_200_/t014e4b443955fa0480.jpg").into(imageView1);
    }
}
