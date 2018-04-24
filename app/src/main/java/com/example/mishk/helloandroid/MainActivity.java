package com.example.mishk.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    public void openEnrollmentPage(View view) {
        String udacity = "http://www.udacity.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(udacity));
        startActivity(i);

    }
}