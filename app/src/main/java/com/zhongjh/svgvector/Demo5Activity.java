package com.zhongjh.svgvector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Demo5Activity extends AppCompatActivity {

    private boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo5);

        findViewById(R.id.radiobutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isChecked = !isChecked;
                final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
                ((ImageView) findViewById(R.id.radiobutton)).setImageState(stateSet, true);
            }
        });

    }
}
