package com.example.block2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listviewanimals = (ListView) findViewById(R.id.listView);
        final ArrayAdapter<CharSequence> adapteranimals = ArrayAdapter.createFromResource(this,
                R.array.animalsarray,
                android.R.layout.simple_list_item_1);
        listviewanimals.setAdapter(adapteranimals);
        listviewanimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String message = getString(R.string.toastmessage) + adapteranimals.getItem(position);
                Toast.makeText(getApplicationContext(),
                        message,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
