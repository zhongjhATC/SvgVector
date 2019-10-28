package com.zhongjh.svgvector;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Demo9Activity extends AppCompatActivity {

    private Animatable cursiveAvd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo9);

        cursiveAvd = ((Animatable) ((ImageView) findViewById(R.id.cursiveIcon)).getDrawable());
        restartCursiveAnimation();

        findViewById(R.id.cursiveIcon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cursiveAvd.stop();
                cursiveAvd.start();
            }
        });

    }

    private void restartCursiveAnimation() {
        cursiveAvd.stop();
        cursiveAvd.start();
    }

}
