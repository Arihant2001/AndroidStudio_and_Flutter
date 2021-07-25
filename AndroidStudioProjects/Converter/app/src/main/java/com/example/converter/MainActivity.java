package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttoncmtk = (Button) findViewById(R.id.buttoncmtk);
        buttoncmtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxm = (EditText) findViewById(R.id.editTextcmtk);
                EditText textBoxk = (EditText) findViewById(R.id.editTextcktm);
                double vmiles = Double.valueOf(textBoxm.getText().toString());
                double vkm = vmiles / 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                textBoxk.setText(formatval.format(vkm));
            }
        });
        Button buttoncktm = (Button) findViewById(R.id.buttoncktm);
        buttoncktm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxm = (EditText) findViewById(R.id.editTextcmtk);
                EditText textBoxk = (EditText) findViewById(R.id.editTextcktm);
                double vkm = Double.valueOf(textBoxk.getText().toString());
                double vmiles = vkm * 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                textBoxm.setText(formatval.format(vmiles));
            }
        });
    }
}
