package com.example.euro2020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private ImageView btnGroups;
private ImageView btnReferees;
private ImageView btnStadiums;
private ImageView btnHistory;
private ImageView btnSummary;
private ImageView btnAbout;
private ImageView btnResults;
private ImageView btnStandings;
private ImageView btnIgrac;
private TextView textStandings, textRes, textGro, textRef1, textRef2, textSta,textSta2, textSta3, textHis,textHis2, textSum, textSum2, textAbo, textPoints,txtIgrac;

private ScrollView scroll1, scroll2, scroll3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGroups = findViewById(R.id.btnGroups);
        btnReferees = findViewById(R.id.btnReferees);
        btnStadiums = findViewById(R.id.btnStadiums);
        btnHistory = findViewById(R.id.btnHistory);
        btnSummary = findViewById(R.id.btnSummary);
        btnAbout = findViewById(R.id.btnAbout);
        btnResults = findViewById(R.id.btnResults);
        btnStandings = findViewById(R.id.btnStandings);
        btnIgrac = findViewById(R.id.btnIgrac);

      //  textGro = findViewById(R.id.textGro);
        textRef1 = findViewById(R.id.textRef1);
        textRef2 = findViewById(R.id.textRef2);
        textSta = findViewById(R.id.textSta);
        textSta2 = findViewById(R.id.textSta2);
        textSta3 = findViewById(R.id.textSta3);
   //     textHis = findViewById(R.id.textHis);
     //   textHis2 = findViewById(R.id.textHis2);
    //  textSum = findViewById(R.id.textSum);
      //  textSum2 = findViewById(R.id.textSum2);
      //  textAbo = findViewById(R.id.textAbo);
      //  textRes = findViewById(R.id.textRes);
        textStandings = findViewById(R.id.textStandings);
        textPoints = findViewById(R.id.textPoints);

        txtIgrac = findViewById(R.id.txtIgrac);

        scroll1 = findViewById(R.id.scroll1);
        scroll2 = findViewById(R.id.scroll2);
        scroll3 = findViewById(R.id.scroll3);

//        final Typeface typeface = ResourcesCompat.getFont(this,R.font.amsterdam);
//            textGro.setTypeface(typeface);
//            textGro.setTextSize(40);
//
//            textAbo.setTypeface(typeface);
//            textAbo.setTextSize(40);

        final Typeface typeface1 = ResourcesCompat.getFont(this,R.font.monttrela);
        textRef1.setTypeface(typeface1);
        textRef1.setTextSize(15);
        textRef2.setTypeface(typeface1);
        textRef2.setTextSize(15);
//        textRes.setTypeface(typeface1);
//        textRes.setTextSize(15);
//        textStandings.setTypeface(typeface1);
//        textStandings.setTextSize(15);
//        textPoints.setTypeface(typeface1);
//        textPoints.setTextSize(15);

        final Typeface typeface2 = ResourcesCompat.getFont(this,R.font.emelyndbold);
        textSta.setTypeface(typeface2);
        textSta.setTextSize(18);
        textSta2.setTypeface(typeface2);
        textSta2.setTextSize(16);
        textSta3.setTypeface(typeface2);
        textSta3.setTextSize(18);

//        final Typeface typeface3 = ResourcesCompat.getFont(this,R.font.harmony);
//        textHis.setTypeface(typeface3);
//        textHis.setTextSize(30);
//        textHis2.setTypeface(typeface3);
//        textHis2.setTextSize(30);

//        final Typeface typeface4 = ResourcesCompat.getFont(this,R.font.walletsignature);
//        textSum.setTypeface(typeface4);
//        textSum.setTextSize(30);
//        textSum2.setTypeface(typeface4);
//        textSum2.setTextSize(30);

//        final Typeface typeface5 = ResourcesCompat.getFont(this,R.font.walletsignature);
//        textRef.setTypeface(typeface5);
//        textRef.setTextSize(20);

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        btnSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SummaryActivity.class);
                startActivity(intent);
            }
        });

        btnStadiums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StadiumActivity.class);
                startActivity(intent);
            }
        });
        btnReferees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RefereeActivity.class);
                startActivity(intent);
            }
        });
        btnGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GroupsActivity.class);
                startActivity(intent);
            }
        });

        btnResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ResultsActivity.class);
                startActivity(intent);
            }
        });

        btnStandings.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,StandingsActivity.class);
              startActivity(intent);
          }
        });

        btnIgrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,IgracActivity.class);
                startActivity(intent);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Verison 1.0.0", Toast.LENGTH_SHORT).show();
               AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(getString(R.string.app_name));
                builder.setMessage("Designed and Developed from Aleksandar");
                builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.setPositiveButton("EURO2020OfficialWebsite", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MainActivity.this, WebsiteActivity.class);
                        intent.putExtra("url", "https://www.uefa.com/uefaeuro-2020/");
                        startActivity(intent);
                    }
                });

                builder.create().show();
            }
        });

    }
}