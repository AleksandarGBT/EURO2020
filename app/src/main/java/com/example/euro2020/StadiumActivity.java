package com.example.euro2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class StadiumActivity extends AppCompatActivity {

    private RecyclerView stadiumsRecView;
    private StadiumRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium);

        adapter = new StadiumRecViewAdapter(this);
        stadiumsRecView = findViewById(R.id.stadiumsRecView);

        stadiumsRecView.setAdapter(adapter);
        stadiumsRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Stadium> stadiums = new ArrayList<>();
        stadiums.add(new Stadium(1,"Johan Cruijff Arena","Amsterdam","Netherlands","55500","https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Amsterdam_Arena_Roof_Closed.jpg/400px-Amsterdam_Arena_Roof_Closed.jpg"));
        stadiums.add(new Stadium(2,"Baku Olympic Stadium","Baku","Azerbaijan","69870","https://www.e-architect.com/wp-content/uploads/2010/02/baku-olympic-stadium-azerbaijan-arena-building.jpg"));
        stadiums.add(new Stadium(3,"National Arena Bucharest","Bucharest","Romania","55634","https://thesetpieces.com/wp-content/uploads/2016/08/Arena-Na%C8%9Bional%C4%83.jpg"));
        stadiums.add(new Stadium(4,"Puskas Arena","Budapest","Hungary","38652","https://www.stadiumguide.com/wp-content/uploads/puskas11.jpg"));
        stadiums.add(new Stadium(5,"Parken Stadium","Copenhagen","Denmark","38065","https://upload.wikimedia.org/wikipedia/commons/3/3f/Parken_from_the_air_1.JPG"));
        stadiums.add(new Stadium(6,"Hampden Park","Glasgow","Scotland","51866","https://i.goalzz.com/?i=o%2Fs%2F3%2F664%2Fhampden-park-1.jpg"));
        stadiums.add(new Stadium(7,"Wembley Stadium","London","England","90000","https://i.pinimg.com/originals/81/d6/b8/81d6b8a1599774eaabe52561364268f1.jpg"));
        stadiums.add(new Stadium(8,"Football Arena Munich","Munich","Germany","70000","https://ak.picdn.net/shutterstock/videos/1038056066/thumb/1.jpg"));
        stadiums.add(new Stadium(9,"Olimpico in Rome","Rome","Italy","72698","https://img.fifa.com/image/upload/t_l4/ta6t9uedkxma9fndnkr3.jpg"));
        stadiums.add(new Stadium(10,"Saint Petersburg Stadium","Saint Petersburg","Russia","68000","https://www.stadiumguide.com/wp-content/uploads/stpetersburgnew_top.jpg"));
        stadiums.add(new Stadium(11,"Estadio La Cartuja","Seville","Spain","60000","https://sportsmatik.com/uploads/wiki-venues/estadio-de-la-cartuja_1581069283.jpg"));

        adapter.setStadiums(stadiums);
    }
}