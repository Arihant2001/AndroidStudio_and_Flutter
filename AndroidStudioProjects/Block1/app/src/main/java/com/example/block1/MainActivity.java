package com.example.block1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonb, buttonp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonb = (Button) findViewById(R.id.buttonbi);
        buttonp = (Button) findViewById(R.id.buttonpp);
    }

    public void  todo(View v){
        if (v.equals(buttonb))
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonp))
            Toast.makeText(getApplicationContext(),
                    "to do to do",
                    Toast.LENGTH_SHORT).show();
    }
}
