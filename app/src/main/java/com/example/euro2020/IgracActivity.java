package com.example.euro2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IgracActivity extends AppCompatActivity {

    private ImageView allPlayers, allPlayersByName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igrac);

        allPlayers = findViewById(R.id.allPlayers);
        allPlayersByName = findViewById(R.id.allPlayersByName);

        allPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IgracActivity.this, PlayersActivity.class);
                startActivity(intent);
            }
        });

        allPlayersByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(IgracActivity.this, PlayersActivity2.class);
                startActivity(intent2);
            }
        });


    }
}