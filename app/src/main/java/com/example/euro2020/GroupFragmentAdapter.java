package com.example.euro2020;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class GroupFragmentAdapter extends FragmentStateAdapter {

    public GroupFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new SecondGroupFragment();

        }

        return new FirstGroupFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }



}
