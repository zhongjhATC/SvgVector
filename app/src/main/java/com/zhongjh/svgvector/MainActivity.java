package com.zhongjh.svgvector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 第一个例子
        findViewById(R.id.btnActivity1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo1Activity.class));
            }
        });

        // 第二个例子
        findViewById(R.id.btnActivity2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo2Activity.class));
            }
        });

        // 第三个例子
        findViewById(R.id.btnActivity3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo3Activity.class));
            }
        });

        // 第四个例子
        findViewById(R.id.btnActivity4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo4Activity.class));
            }
        });

    }
}
