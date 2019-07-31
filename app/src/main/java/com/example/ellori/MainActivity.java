package com.example.ellori;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart()
    {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On start",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnResume",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause()
    {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On Pause",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop()
    {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnStop",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnDestroy",Toast.LENGTH_SHORT).show();

    }


}
