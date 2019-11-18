package com.zhongjh.svgvector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Demo14Activity extends AppCompatActivity {

    @BindView(R.id.eye) ImageView eyeView;
    private boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo14);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.rootview)
    void onClick() {
        isChecked = !isChecked;
        final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
        eyeView.setImageState(stateSet, true);
    }

}
