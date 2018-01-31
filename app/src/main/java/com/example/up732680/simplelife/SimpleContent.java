package com.example.up732680.simplelife;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SimpleContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_simple_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);


        TextView textView = (TextView) findViewById(R.id.ase);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView2 = (TextView) findViewById(R.id.nenga);
        textView2.setPaintFlags(textView2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView3 = (TextView) findViewById(R.id.syssec);
        textView3.setPaintFlags(textView3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView4 = (TextView) findViewById(R.id.rass);
        textView4.setPaintFlags(textView4.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView5 = (TextView) findViewById(R.id.fyp);
        textView5.setPaintFlags(textView5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView textView6 = (TextView) findViewById(R.id.robotic);
        textView6.setPaintFlags(textView6.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu:
                //menu page
                Intent menu = new Intent(SimpleContent.this, SimpleHome.class);
                startActivity(menu);
                break;
            case R.id.settings:
                Intent settings = new Intent(SimpleContent.this, SimpleSettings.class);
                startActivity(settings);
                //settings
                break;
            case R.id.profile:
                Intent profile = new Intent(SimpleContent.this, SimpleProfile.class);
                startActivity(profile);
                //profile
                break;
            case R.id.calendar:
                Intent calendar = new Intent(SimpleContent.this, SimpleTimeTable.class);
                startActivity(calendar);
                //calendar
                break;
            case R.id.schedule:
                Intent schedule = new Intent(SimpleContent.this, SimpleSchedule.class);
                startActivity(schedule);
                //schedule
                break;
            default:
                // unkown error
        }
        return super.onOptionsItemSelected(item);

    }
}
