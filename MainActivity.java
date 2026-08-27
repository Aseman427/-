package com.mehrab.accounting;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebSettings; import android.webkit.WebView; import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 WebView w;
 @Override public void onCreate(Bundle b){super.onCreate(b);w=new WebView(this);setContentView(w);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);w.setWebViewClient(new WebViewClient());w.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){if(w.canGoBack())w.goBack();else super.onBackPressed();}
}