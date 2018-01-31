package com.example.up732680.simplelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SimpleHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_home);
    }


    public void profileb(View v) {
        Intent opennew = new Intent(SimpleHome.this, SimpleProfile.class);
        startActivity(opennew);
    }

    public void aboutusb(View v) {
        Intent opennew2 = new Intent(SimpleHome.this, SimpleAboutUs.class);
        startActivity(opennew2);
    }

    public void contentb(View v) {
        Intent opennew3 = new Intent(SimpleHome.this, SimpleContent.class);
        startActivity(opennew3);
    }

    public void scheduleb(View v) {
        Intent opennew4 = new Intent(SimpleHome.this, SimpleSchedule.class);
        startActivity(opennew4);
    }

    public void calenderb(View v) {
        Intent opennew5 = new Intent(SimpleHome.this, SimpleTimeTable.class);
        startActivity(opennew5);
    }

    public void settingb(View v) {
        Intent opennew6 = new Intent(SimpleHome.this, SimpleSettings.class);
        startActivity(opennew6);
    }

    public void reminderb(View v) {
        Intent opennew7 = new Intent(SimpleHome.this, SimpleReminder.class);
        startActivity(opennew7);
    }

    public void ptwb(View v) {
        Intent opennew8 = new Intent(SimpleHome.this, SimplePTW.class);
        startActivity(opennew8);
    }

    public void meetingb(View v) {
        Intent opennew9 = new Intent(SimpleHome.this, SimpleMeetings.class);
        startActivity(opennew9);
    }

//make sure you try your hardest and dont get disheartened please dont because you can do it just fucking try your hardest. Dont let the anxiety win.
    //THIS IS un-anxious ALI trying the hardest dont let these man bring you down but not like that i mean like dont see how much work they do.
}
