package com.zhongjh.svgvector;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Demo6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo6);

        ((Animatable) ((ImageView) findViewById(R.id.horizontal_indeterminate_progress)).getDrawable()).start();
    }
}
