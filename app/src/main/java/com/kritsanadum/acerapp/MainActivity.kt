package com.kritsanadum.acerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hide title bar
        supportActionBar?.hide()

        wb_result.webViewClient = WebViewClient()
        wb_result.settings.javaScriptEnabled = true

        var url = "file:///android_asset/thai.html"

        wb_result.loadUrl(url)
    }

    override fun onBackPressed() {
        if(wb_result.canGoBack()){
            wb_result.goBack()
        }else{

            super.onBackPressed()
        }

    }

}
