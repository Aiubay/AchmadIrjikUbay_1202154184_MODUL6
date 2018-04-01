package com.ubay.achmadirjikubay_1202154184_modul6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AIUBAY on 31/03/2018.
 */

public class TabsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    public TabsPageAdapter(FragmentManager fm) {
        super(fm);
    }
    public void addFragment(Fragment fragment,  String Tittle){
mFragmentList.add(fragment);
mFragmentTitleList.add(Tittle);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
