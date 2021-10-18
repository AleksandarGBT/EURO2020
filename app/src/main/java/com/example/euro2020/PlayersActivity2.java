package com.example.euro2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class PlayersActivity2 extends AppCompatActivity {

    private RecyclerView playerRecView;
    private PlayerRecViewAdapter2 adapter2;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main2_menu,menu);
        MenuItem item2 = menu.findItem(R.id.action_search2);
        SearchView searchView2 = (SearchView) item2.getActionView();
        searchView2.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter2.getFilter().filter(newText);
                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        adapter2 = new PlayerRecViewAdapter2(this);

        playerRecView = findViewById(R.id.playerRecView);
        playerRecView.setAdapter(adapter2);
        playerRecView.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        playerRecView.addItemDecoration(dividerItemDecoration);

        adapter2.setPlayers(PlayersActivity.initPlayers());





    }
}
