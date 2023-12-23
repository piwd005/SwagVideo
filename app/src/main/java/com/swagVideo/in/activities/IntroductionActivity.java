package com.swagVideo.in.activities;

import android.content.Context;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;
import com.swagVideo.in.R;
import com.swagVideo.in.utils.LocaleUtil;

public class IntroductionActivity extends IntroActivity {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleUtil.wrap(base));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(new SimpleSlide.Builder()
                .title(R.string.slide_1_title)
                .description(R.string.slide_1_description)
                .image(R.drawable.intro_image1)
                .background(R.color.quantum_black_100)
                .backgroundDark(R.color.colorGrey2)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title(R.string.slide_2_title)
                .description(R.string.slide_2_description)
                .image(R.drawable.intro_image2)
                .background(R.color.quantum_black_100)
                .backgroundDark(R.color.colorGrey2)
                .build());
    }
}
