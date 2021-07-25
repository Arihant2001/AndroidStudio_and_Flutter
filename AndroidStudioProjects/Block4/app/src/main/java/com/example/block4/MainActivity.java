package com.example.block4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer casio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        casio = MediaPlayer.create(this,R.raw.hi);
        Switch switch_looping= (Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                casio.setLooping(isChecked);
            }
        });
    }

    public void playmusic (View v) {
        casio.start();
    }
    public void pausemusic (View v) {
        if(casio.isPlaying())
            casio.stop();
    }
}
