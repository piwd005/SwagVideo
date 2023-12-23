package com.swagVideo.in.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;

import com.swagVideo.in.R;

public class VerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        (findViewById(R.id.iv_back)).setOnClickListener(view -> {
            onBackPressed();
        });
        TextView tvEarn = findViewById(R.id.tv_earn);
        TextView tvCondition = findViewById(R.id.tv_condition);

        TextPaint paint = tvEarn.getPaint();
        float width = paint.measureText("CONDITIONS");

        Shader textShader = new LinearGradient(0, 0, width, tvEarn.getTextSize(),
                new int[]{
                        Color.parseColor("#FFFFFF"),
                        Color.parseColor("#FFFFFF"),
                        Color.parseColor("#FFFBCDD8"),
                        Color.parseColor("#FFFB567C"),
                        Color.parseColor("#FFFA3863"),
                      /*  Color.parseColor("#F97C3C"),
                        Color.parseColor("#FDB54E"),
                        Color.parseColor("#64B678"),
                        Color.parseColor("#478AEA"),
                        Color.parseColor("#8446CC"),*/
                }, null, Shader.TileMode.CLAMP);
        tvEarn.getPaint().setShader(textShader);
        tvCondition.getPaint().setShader(textShader);
    }
}