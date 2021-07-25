package com.example.block9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendmessage(View v){
        String message = ((EditText) findViewById(R.id.editTextmessage)).getText().toString();
        Uri destination = Uri.parse("sms");
        Intent smsintent = new Intent(Intent.ACTION_SENDTO, destination);
        smsintent.putExtra("smsbody", message);
        startActivity(smsintent);

    }
}
