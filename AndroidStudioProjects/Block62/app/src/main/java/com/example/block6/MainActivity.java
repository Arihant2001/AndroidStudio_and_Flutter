package com.example.block6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageviewlarge = (ImageView) findViewById(R.id.imageViewlarge);
        imageviewlarge.setImageResource(R.drawable.avenger);

        SeekBar tuner = (SeekBar) findViewById(R.id.seekbartuner);
        tuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int lastprogress;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lastprogress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                imageviewlarge.setColorFilter(Color.argb(255, 0, lastprogress, 255-lastprogress));
            }
        });
    }
}
