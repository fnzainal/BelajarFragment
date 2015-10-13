package dev.vobia.belajarfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dev.vobia.belajarfragment.adapter.AdapterFragmentTab;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tabViewPager);
        viewPager = (ViewPager)findViewById(R.id.pager);

        viewPager.setAdapter(new AdapterFragmentTab(getSupportFragmentManager()));

        /*tabLayout.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),
                getResources(),getColor(android.R.color.white));*/
        tabLayout.setupWithViewPager(viewPager);

    }
}
