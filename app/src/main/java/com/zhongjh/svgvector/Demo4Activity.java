package com.zhongjh.svgvector;

import android.graphics.drawable.Animatable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Demo4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo4);

        findViewById(R.id.alarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 闹钟振动
                ((Animatable) ((ImageView)findViewById(R.id.alarm)).getDrawable()).start();
            }
        });
    }
}
