package com.example.euro2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class GroupsActivity extends AppCompatActivity {

    TabLayout tabLayout2;
    ViewPager2 pager3;
    GroupFragmentAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        tabLayout2 = findViewById(R.id.tab_layout2);
        pager3 = findViewById(R.id.view_pager22);

        FragmentManager fm = getSupportFragmentManager();
        adapter2 = new GroupFragmentAdapter(fm,getLifecycle());
        pager3.setAdapter(adapter2);

        tabLayout2.addTab(tabLayout2.newTab().setText("DRAW"));
        tabLayout2.addTab(tabLayout2.newTab().setText("STANDINGS"));


        tabLayout2.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager3.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager3.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout2.selectTab(tabLayout2.getTabAt(position));
            }
        });
    }
}

