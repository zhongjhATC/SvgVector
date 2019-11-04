package com.zhongjh.svgvector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;

public class Demo12Activity extends AppCompatActivity {

    @BindView(R.id.drawer)
    ImageView drawerView;
    @BindView(R.id.crosstick) ImageView crossTickView;
    @BindView(R.id.plusminus) ImageView plusMinusView;
    @BindView(R.id.arrowoverflow) ImageView arrowoverflowView;
    private boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo12);
    }



}
