package com.example.basketshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class JordanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jordan);

        RelativeLayout box1 = findViewById(R.id.box1);
        RelativeLayout box2 = findViewById(R.id.box2);
        RelativeLayout box3 = findViewById(R.id.box3);
        RelativeLayout box4 = findViewById(R.id.box4);

        box1.setOnClickListener(v -> {
            Intent intent = new Intent(JordanActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "JORDAN WESTBROOK ONE TAKE");
            intent.putExtra("PRICE", "3600 грн");
            startActivity(intent);
        });

        box2.setOnClickListener(v -> {
            Intent intent = new Intent(JordanActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "JORDAN MAX AURA");
            intent.putExtra("PRICE", "4990 грн");
            startActivity(intent);
        });

        box3.setOnClickListener(v -> {
            Intent intent = new Intent(JordanActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "JORDAN FLIGHT CLUB");
            intent.putExtra("PRICE", "5490 грн");
            startActivity(intent);
        });

        box4.setOnClickListener(v -> {
            Intent intent = new Intent(JordanActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "JORDAN MAX AURA 4");
            intent.putExtra("PRICE", "5900 грн");
            startActivity(intent);
        });
    }
}
