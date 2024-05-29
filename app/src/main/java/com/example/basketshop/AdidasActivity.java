package com.example.basketshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class AdidasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas);

        RelativeLayout box1 = findViewById(R.id.box1);
        RelativeLayout box2 = findViewById(R.id.box2);
        RelativeLayout box3 = findViewById(R.id.box3);
        RelativeLayout box4 = findViewById(R.id.box4);

        box1.setOnClickListener(v -> {
            Intent intent = new Intent(AdidasActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "ADIDAS TRAE YOUNG 1 BAHIA BLUE");
            intent.putExtra("PRICE", "9700 грн");
            startActivity(intent);
        });

        box2.setOnClickListener(v -> {
            Intent intent = new Intent(AdidasActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "ADIDAS TRAE YOUNG 1 RED");
            intent.putExtra("PRICE", "4500 грн");
            startActivity(intent);
        });

        box3.setOnClickListener(v -> {
            Intent intent = new Intent(AdidasActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "ADIDAS A.E. 1 LOW TRAINERS");
            intent.putExtra("PRICE", "5300 грн");
            startActivity(intent);
        });

        box4.setOnClickListener(v -> {
            Intent intent = new Intent(AdidasActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "ADIDAS HARDEN VOL.6 YELLOW TAXI");
            intent.putExtra("PRICE", "6400 грн");
            startActivity(intent);
        });
    }
}
