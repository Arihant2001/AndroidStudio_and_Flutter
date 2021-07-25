package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calculate = (Button) findViewById(R.id.buttonok);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText doby = (EditText) findViewById(R.id.editTextdoby);
                EditText dobm = (EditText) findViewById(R.id.editTextdobm);
                EditText dobd = (EditText) findViewById(R.id.editTextdobd);
                EditText ty = (EditText) findViewById(R.id.editTextty);
                EditText tm = (EditText) findViewById(R.id.editTexttm);
                EditText td = (EditText) findViewById(R.id.editTexttd);
                EditText y = (EditText) findViewById(R.id.editTexty);
                EditText m = (EditText) findViewById(R.id.editTextm);
                EditText d = (EditText) findViewById(R.id.editTextd);
                EditText bdtcm = (EditText) findViewById(R.id.editTextbdtcm);
                EditText bdtcd = (EditText) findViewById(R.id.editTextbdtcd);
                int noyd = Integer.valueOf(doby.getText().toString());
                int noyt = Integer.valueOf(ty.getText().toString());
                int nomd = Integer.valueOf(dobm.getText().toString());
                int nomt = Integer.valueOf(tm.getText().toString());
                int nodd = Integer.valueOf(dobd.getText().toString());
                int nodt = Integer.valueOf(td.getText().toString());
                int noy = noyt - noyd ;
                int nom = nomt - nomd ;
                int nod = nodt - nodd ;
                int totaldays = (noy * 365) + (nom * 30) + nod;
                int years = totaldays / 365 ;
                double yearst = totaldays / 365 ;
                int extradays = totaldays % 365 ;
                int months = extradays / 30 ;
                int days = extradays % 30 ;
                int bdtc = 365 - extradays ;
                int bdtcmonths = bdtc/30 ;
                int bdtcdays = bdtc%30;
                y.setText(years + "");
                m.setText(months + "");
                d.setText(days+ "");
                if (extradays==0){
                    bdtcm.setText("12");
                    bdtcd.setText("0");
                    String message = "Happy Birthday" ;
                    Toast.makeText(getApplicationContext(),
                            message,
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bdtcm.setText(bdtcmonths + "");
                    bdtcd.setText(bdtcdays + "");
                }
            }
        });
    }
}
