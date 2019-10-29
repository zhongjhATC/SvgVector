package com.zhongjh.svgvector;

import android.graphics.drawable.Animatable;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Demo11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo11);
        startProgressBar(R.id.circular_indeterminate_progress_medium);
    }

    private void startProgressBar(@IdRes int progressBarId) {
        ((Animatable) ((ImageView) findViewById(progressBarId)).getDrawable()).start();
    }
}
