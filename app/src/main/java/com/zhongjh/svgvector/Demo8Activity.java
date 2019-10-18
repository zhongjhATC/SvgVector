package com.zhongjh.svgvector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Demo8Activity extends AppCompatActivity {

    @BindView(R.id.searchback)
    ImageView searchbackView;
    private boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo8);
        ButterKnife.bind(this);
        searchbackView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isChecked = !isChecked;
                final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
                searchbackView.setImageState(stateSet, true);
            }
        });
    }


}
