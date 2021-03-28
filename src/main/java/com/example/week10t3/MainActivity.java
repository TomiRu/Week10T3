package com.example.week10t3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/index.html");
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void executeJavascript(View v){
        web.evaluateJavascript("javascript:shoutOut()",null);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void initializeJavascript(View v){
        web.evaluateJavascript("javascript:initialize()", null);

    }
}