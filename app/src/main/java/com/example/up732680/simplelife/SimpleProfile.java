package com.example.up732680.simplelife;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class SimpleProfile extends AppCompatActivity {

    private static final String TAG = "SimpleProfile";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "TAB1");
        adapter.addFragment(new Tab2Fragment(), "TAB2");
        adapter.addFragment(new Tab3Fragment(), "TAB3");
        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.menu:
                //menu page
                Intent menu = new Intent(SimpleProfile.this,SimpleHome.class );
                startActivity(menu);
                break;
            case R.id.settings:
                Intent settings = new Intent(SimpleProfile.this,SimpleSettings.class );
                startActivity(settings);
                //settings
                break;
            case R.id.profile:
                Intent profile = new Intent(SimpleProfile.this,SimpleProfile.class );
                startActivity(profile);
                //profile
                break;
            case  R.id.calendar:
                Intent calendar = new Intent(SimpleProfile.this,SimpleTimeTable.class );
                startActivity(calendar);
                //calendar
                break;
            case R.id.schedule:
                Intent schedule = new Intent(SimpleProfile.this,SimpleSchedule.class );
                startActivity(schedule);
                //schedule
                break;
            default:
                // unkown error
        }
        return super.onOptionsItemSelected(item);
    }


}