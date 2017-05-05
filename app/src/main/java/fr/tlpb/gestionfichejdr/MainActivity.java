package fr.tlpb.gestionfichejdr;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends AppCompatActivity {

    private WebView laWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        this.laWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = laWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        this.laWebView.loadUrl("file:///android_asset/index.html");
        webSettings.setAllowFileAccess(true);
        webSettings.setBlockNetworkImage(false);
        webSettings.setLoadsImagesAutomatically(true);

        this.laWebView.loadUrl("javascript:test()");
    }


}
