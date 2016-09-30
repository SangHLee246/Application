package com.example.sanghunlee_desktop.amie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void startup(View view) {
        //Do something in response to button
        setContentView(R.layout.startup);
    }

    public void startupsignup(View view) {
        //Do something in response to button
        setContentView(R.layout.searchpreferences);
    }
}
