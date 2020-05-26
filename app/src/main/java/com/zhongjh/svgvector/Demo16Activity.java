package com.zhongjh.svgvector;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Demo16Activity extends AppCompatActivity {

    @BindView(R.id.imgFaceBox)
    ImageView imgFaceBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo16);
        ButterKnife.bind(this);
//        VectorDrawable vectorDrawable = new VectorDrawable();

        ((Animatable) (imgFaceBox).getDrawable()).start();

        imgFaceBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Animator animator = AnimatorInflater.loadAnimator(Demo16Activity.this, R.animator.alpha);
//                animator.setTarget(findViewById(R.id.imgFaceBox));
//                animator.start();
                ((Animatable) (imgFaceBox).getDrawable()).start();
            }
        });
    }

}