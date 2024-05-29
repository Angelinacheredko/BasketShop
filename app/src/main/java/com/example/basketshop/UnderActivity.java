package com.example.basketshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class UnderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_armour);

        RelativeLayout box1 = findViewById(R.id.box1);
        RelativeLayout box2 = findViewById(R.id.box2);
        RelativeLayout box3 = findViewById(R.id.box3);
        RelativeLayout box4 = findViewById(R.id.box4);

        box1.setOnClickListener(v -> {
            Intent intent = new Intent(UnderActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "UNDER ARMOUR LOCKDOWN 6");
            intent.putExtra("PRICE", "3300 грн");
            startActivity(intent);
        });

        box2.setOnClickListener(v -> {
            Intent intent = new Intent(UnderActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "UNDER ARMOUR JET 23");
            intent.putExtra("PRICE", "3500 грн");
            startActivity(intent);
        });

        box3.setOnClickListener(v -> {
            Intent intent = new Intent(UnderActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "UNDER ARMOUR LOCKDOWN 6");
            intent.putExtra("PRICE", "3200 грн");
            startActivity(intent);
        });

        box4.setOnClickListener(v -> {
            Intent intent = new Intent(UnderActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "UNDER ARMOUR LOCKDOWN RED");
            intent.putExtra("PRICE", "3200 грн");
            startActivity(intent);
        });
    }
}
