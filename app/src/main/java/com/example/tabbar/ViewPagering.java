package com.example.tabbar;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagering extends FragmentPagerAdapter
{
    private Context context;
    int totalCount;

    public ViewPagering(@NonNull FragmentManager fm, Context context,int totalCount) {
        super(fm);
        this.context = context;
        this.totalCount = totalCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                SettingFragment settingFragment = new SettingFragment();
                return settingFragment;
            default:
                return null;
          }

    }

    @Override
    public int getCount() {
        return totalCount;
    }

}
