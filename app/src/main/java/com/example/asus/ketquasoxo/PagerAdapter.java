package com.example.asus.ketquasoxo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.asus.ketquasoxo.Fragment.XoSoFragment;

import java.util.List;

/**
 * Created by ASUS on 4/25/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    private List<XoSoFragment> data;
    private String[] nameTab;
    public PagerAdapter(FragmentManager fm, List<XoSoFragment> data , String[] nameTab ) {
        super(fm);
        this.data = data;
        this.nameTab =nameTab;
    }

    @Override
    public Fragment getItem(int position) {

        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return  nameTab[position];
    }
}

