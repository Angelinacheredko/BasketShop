package com.example.basketshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView btnNike = findViewById(R.id.btn_nike);
        TextView btnJordan = findViewById(R.id.btn_jordan);
        TextView btnUnderArmour = findViewById(R.id.btn_under_armour);
        TextView btnAdidas = findViewById(R.id.btn_adidas);

        btnNike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NikeActivity.class);
                startActivity(intent);
            }
        });

        btnJordan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JordanActivity.class);
                startActivity(intent);
            }
        });

        btnUnderArmour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UnderActivity.class);
                startActivity(intent);
            }
        });

        btnAdidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdidasActivity.class);
                startActivity(intent);
            }
        });
    }
}
