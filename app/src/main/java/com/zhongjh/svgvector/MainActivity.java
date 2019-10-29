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

        // 第五个例子
        findViewById(R.id.btnActivity5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo5Activity.class));
            }
        });

        // 第六个例子
        findViewById(R.id.btnActivity6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo6Activity.class));
            }
        });

        // 第七个例子
        findViewById(R.id.btnActivity7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo7Activity.class));
            }
        });

        // 第八个例子
        findViewById(R.id.btnActivity8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo8Activity.class));
            }
        });

        // 第九个例子
        findViewById(R.id.btnActivity9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo9Activity.class));
            }
        });

        // 第十个例子
        findViewById(R.id.btnActivity10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo10Activity.class));
            }
        });

        // 第十一个例子
        findViewById(R.id.btnActivity11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Demo11Activity.class));
            }
        });

    }
}
