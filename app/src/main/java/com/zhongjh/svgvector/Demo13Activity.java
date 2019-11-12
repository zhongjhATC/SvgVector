package com.zhongjh.svgvector;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Demo13Activity extends AppCompatActivity {


    @BindView(R.id.timer)
    ImageView timerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo13);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.rootview)
    void onClick() {
        ((Animatable) timerView.getDrawable()).start();
    }
}
