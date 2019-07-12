package com.billscomconsult.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {

    private WebView wvAboutAlc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        wvAboutAlc = findViewById(R.id.wvAboutAlc);
        wvAboutAlc.getSettings().setJavaScriptEnabled(true);
        wvAboutAlc.setWebViewClient(new WebViewClient() {

                    @Override
                    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                        handler.proceed();
                    }
                });
        wvAboutAlc.loadUrl("https://andela.com/alc/");

    }
}
