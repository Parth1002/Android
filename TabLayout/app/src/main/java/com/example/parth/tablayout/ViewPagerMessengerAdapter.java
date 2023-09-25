package com.example.parth.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Parth on 18-07-2023.
 */

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {


    public ViewPagerMessengerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new ChatFragment();
        }else if(position==1){
            return new StatusFragment();
        }else {
            return new CallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3; // no of tabs
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "Chats";
        }else if (position==1){
            return "Status";
        }else {
            return "Calls";
        }
    }
}
