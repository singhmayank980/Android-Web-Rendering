package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView mywebview;
    private Object MyWebViewClient;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mywebview = (WebView)findViewById(R.id.mywebview);
       WebSettings webSettings = mywebview.getSettings();
       webSettings.setJavaScriptEnabled(true);
       mywebview.loadUrl("https://www.youtube.com/");

       mywebview.setWebViewClient(new WebViewClient()); // prevent code from opening in the browser

    }

    @Override
    public void onBackPressed() {

        if(mywebview.canGoBack())
        {
            mywebview.goBack();
        }else
        {
            super.onBackPressed();
        }

    }
}
