package com.example.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class WebViewActivity extends AppCompatActivity {

    public static TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        txt = findViewById(R.id.txt);


        Intent intent = getIntent();
        String str = intent.getStringExtra("key");

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl(str);

    }
}