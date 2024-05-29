package com.example.basketshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class NikeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike);

        RelativeLayout box1 = findViewById(R.id.box1);
        RelativeLayout box2 = findViewById(R.id.box2);
        RelativeLayout box3 = findViewById(R.id.box3);
        RelativeLayout box4 = findViewById(R.id.box4);

        box1.setOnClickListener(v -> {
            Intent intent = new Intent(NikeActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "NIKE ZOOM FREAK 4 BASKETBALL");
            intent.putExtra("PRICE", "4600 грн");
            startActivity(intent);
        });

        box2.setOnClickListener(v -> {
            Intent intent = new Intent(NikeActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "NIKE KD TREY 5 X");
            intent.putExtra("PRICE", "4880 грн");
            startActivity(intent);
        });

        box3.setOnClickListener(v -> {
            Intent intent = new Intent(NikeActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "NIKE PRECISION 6");
            intent.putExtra("PRICE", "3990 грн");
            startActivity(intent);
        });

        box4.setOnClickListener(v -> {
            Intent intent = new Intent(NikeActivity.this, SuccessActivity.class);
            intent.putExtra("SHOES", "NIKE RENEW ELEVATE 3");
            intent.putExtra("PRICE", "4100 грн");
            startActivity(intent);
        });
    }
}
