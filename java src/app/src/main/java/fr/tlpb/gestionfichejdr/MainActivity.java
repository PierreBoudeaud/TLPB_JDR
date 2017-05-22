package fr.tlpb.gestionfichejdr;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.Exception;

import fr.tlpb.gestionfichejdr.Metier.Joueur;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends AppCompatActivity {

    private WebView laWebView;
    final JavaScriptInterface myJavascriptInterface = new JavaScriptInterface(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        this.laWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = laWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        this.laWebView.addJavascriptInterface(myJavascriptInterface, "Android");
        this.laWebView.loadUrl("file:///android_asset/index.html");
        webSettings.setAllowFileAccess(true);
        webSettings.setBlockNetworkImage(false);
        webSettings.setLoadsImagesAutomatically(true);
    }

    /*public static String toHexString(byte[] ba) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < ba.length; i++)
            str.append(String.format("%x", ba[i]));
        return str.toString();
    }*/

    public class JavaScriptInterface {
        Context mContext;

        JavaScriptInterface(Context c) {
            mContext = c;
        }

        @JavascriptInterface
        public void hello(){
            System.out.println("Hello Javascript");
        }

        @JavascriptInterface
        public String getJsonJoueur(String pseudo, String mdp){
            String json;
            Joueur unJoueur;

            unJoueur = new Joueur(pseudo, mdp);
            json = unJoueur.toJson();
            System.out.println(json);
            return json;
        }

        @JavascriptInterface
        public void updateInfosCo(String json){
            File leFichierInfos;
            FileOutputStream outputStream;

            leFichierInfos = new File("file:///android_asset/infos_co.tlpb");
            try{
                outputStream = openFileOutput("infos_co.tlpb", Context.MODE_PRIVATE);
                outputStream.write(json.getBytes());
                outputStream.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
