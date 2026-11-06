package com.codebot.webview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlRedirect(view: WebView?, url: String?, androidClient: android.webkit.WebView.HitTestRequest?, params: android.os.Bundle?): Boolean {
                return false
            }
        }
        setContentView(webView)
        webView.loadUrl("https://google.com")
    }
}