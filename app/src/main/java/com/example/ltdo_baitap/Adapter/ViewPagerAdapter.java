package com.example.ltdo_baitap.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ltdo_baitap.Fragment.CalendarFragment;
import com.example.ltdo_baitap.Fragment.ProfileFragment;
import com.example.ltdo_baitap.Fragment.ScoreFragment;


public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ProfileFragment();
            case 1:
                return new ScoreFragment();
            case 2:
                return new CalendarFragment();
            default:
                return new ProfileFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
