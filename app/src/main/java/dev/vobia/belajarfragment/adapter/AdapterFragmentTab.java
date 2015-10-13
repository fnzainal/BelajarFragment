package dev.vobia.belajarfragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import dev.vobia.belajarfragment.TabFragment1;
import dev.vobia.belajarfragment.TabFragment2;

/**
 * Created by zainal on 13/10/15.
 */
public class AdapterFragmentTab extends FragmentPagerAdapter {

    String[] title = new String[]{"Tab 1", "Tab 2"};

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    public AdapterFragmentTab(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment tab = null;
        switch (position){
            case 0 :
                tab = new TabFragment1();
                break;
            case 1 :
                tab = new TabFragment2();

        }
        return tab;
    }

    @Override
    public int getCount() {
        return 2;
    }



}
