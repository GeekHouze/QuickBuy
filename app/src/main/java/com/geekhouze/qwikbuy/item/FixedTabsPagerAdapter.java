package com.geekhouze.qwikbuy.item;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.geekhouze.qwikbuy.R;
import com.geekhouze.qwikbuy.WishList;
import com.google.auto.value.extension.AutoValueExtension;

import java.util.ResourceBundle;

public class FixedTabsPagerAdapter extends FragmentPagerAdapter{

    private Context context;

    public FixedTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                // return Fragment
                return new WishList();
            case 1:
                // return Fragment
                return new WishList();
            case 2:
                // return Fragment
                return new WishList();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return  getString(R.string.description);
            case 1:
                return getString(R.string.info);
            case 2:
                return getString(R.string.reviews);
            default:
                return null;

        }
    }

    private CharSequence getString(int id) {
        return context.getResources().getString(id);
    }
}
