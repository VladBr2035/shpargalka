package com.example.kitchenoftheworld;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent(this, SecondActivity.class);
        ListView list = findViewById(R.id.kitchen_array);
        list.setAdapter(new ArrayAdapter<>(this, R.layout.custom_main,
                getResources().getStringArray(R.array.kitchen_array)));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                intent.putExtra("key", ((TextView)itemClicked).getText()+".html");
                startActivity(intent);
            }
        });
    }
}