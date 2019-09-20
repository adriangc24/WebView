package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    WebView wv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        wv = (WebView)findViewById(R.id.webView);
        String url = getIntent().getStringExtra("sitioWeb");
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://"+url);

    }
    public void cerrar (View view){
        Intent i2 = new Intent(this,MainActivity.class);
        startActivity(i2);
    }
}
