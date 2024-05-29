package com.example.basketshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        TextView shoesName = findViewById(R.id.shoes_name);
        TextView price = findViewById(R.id.price);
        Button homeButton = findViewById(R.id.home_button);

        Intent intent = getIntent();
        String shoes = intent.getStringExtra("SHOES");
        String priceValue = intent.getStringExtra("PRICE");

        shoesName.setText(shoes);
        price.setText(priceValue);

        homeButton.setOnClickListener(v -> {
            Intent homeIntent = new Intent(SuccessActivity.this, MainActivity.class);
            startActivity(homeIntent);
            finish();
        });
    }
}
