package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageradapter extends FragmentPagerAdapter {

    public pageradapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ChatFrag();
        } else if (position==1) {
            return new CallFrag();
        }
        else{
            return new StatusFrag();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position){
        if (position==0){
            return "CHAT";
        }
        else if(position==1){
            return "CALL";
        }
        else{
            return "STATUS";
        }
    }
}
