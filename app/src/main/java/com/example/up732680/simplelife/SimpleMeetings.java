package com.example.up732680.simplelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SimpleMeetings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_meetings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
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
                Intent menu = new Intent(SimpleMeetings.this,SimpleHome.class );
                startActivity(menu);
                break;
            case R.id.settings:
                Intent settings = new Intent(SimpleMeetings.this,SimpleSettings.class );
                startActivity(settings);
                //settings
                break;
            case R.id.profile:
                Intent profile = new Intent(SimpleMeetings.this,SimpleProfile.class );
                startActivity(profile);
                //profile
                break;
            case  R.id.calendar:
                Intent calendar = new Intent(SimpleMeetings.this,SimpleTimeTable.class );
                startActivity(calendar);
                //calendar
                break;
            case R.id.schedule:
                Intent schedule = new Intent(SimpleMeetings.this,SimpleSchedule.class );
                startActivity(schedule);
                //schedule
                break;
            default:
                // unkown error
        }
        return super.onOptionsItemSelected(item);
    }
}
