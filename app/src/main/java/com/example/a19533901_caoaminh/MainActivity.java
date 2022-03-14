package com.example.a19533901_caoaminh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNvM = findViewById(R.id.btn_ng_vs_may);
        Button btnMvM = findViewById(R.id.btn_may_vs_may);

        btnNvM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BT1.class);
                startActivity(i);
            }
        });
        btnMvM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, BT2.class);
                startActivity(i2);
            }
        });
    }
}