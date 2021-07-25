package com.example.block8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enter(View v){
        RatingBar ratingbar = (RatingBar) findViewById(R.id.ratingBar);
        float rating = ratingbar.getRating();
        Intent gotosecond = new Intent();
        gotosecond.setClass(this, SecondActivity.class);
        gotosecond.putExtra("nbStars", rating);
        startActivity(gotosecond);
        finish();
    }
}
