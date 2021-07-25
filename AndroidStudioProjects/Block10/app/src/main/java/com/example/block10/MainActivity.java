package com.example.block10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker possibilities;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilities = (NumberPicker) findViewById(R.id.numberpicker);
        webview = (WebView) findViewById(R.id.webView);
        String[] possibilitiesStrings = {
                "Android",
                "Checklist",
                "Coursera",
                "Supelec"
        };
        possibilities.setDisplayedValues(possibilitiesStrings);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesStrings.length-1);
    }
    public void navigate(View v){
        int choice = possibilities.getValue();
        if(choice == 0)
            webview.loadUrl("file:///android_asset/trial1.cpp");
        else if (choice == 2)
            webview.loadUrl("http://www.coursera.org");
    }
}
