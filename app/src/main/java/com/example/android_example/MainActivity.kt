package com.example.android_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myWebView = WebView(applicationContext)
//        val webview: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://platform.glozinc.com")
        myWebView.settings.javaScriptEnabled = true
        setContentView(myWebView)
    }
}