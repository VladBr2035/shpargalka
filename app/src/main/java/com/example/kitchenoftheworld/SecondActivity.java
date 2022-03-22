package com.example.kitchenoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WebView textView = findViewById(R.id.textView);
        textView.loadUrl("file:///android_asset/" + getIntent().getStringExtra("key"));
    }
}