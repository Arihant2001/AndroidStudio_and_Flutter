package com.example.block5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("COLOR", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);

            if (preferences.contains(("colorid")))
                layout.setBackgroundColor(preferences.getInt("colorid",0));

        RadioGroup radioGroup_color = (RadioGroup) findViewById(R.id.radioGroup_color);
        radioGroup_color.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int colorcode = 0;
                switch (checkedId) {
                    case R.id.radioButtonblue:
                        colorcode = Color.BLUE;
                        break;
                    case R.id.radioButtonmagenta:
                        colorcode = Color.MAGENTA;
                        break;
                    case R.id.radioButtonyellow:
                        colorcode = Color.YELLOW;
                        break;
                }
                layout.setBackgroundColor(colorcode);
                editor.putInt("colorid", colorcode);
                editor.commit();
            }
        });
    }
}
