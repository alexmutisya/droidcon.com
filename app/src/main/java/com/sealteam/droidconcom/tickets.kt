package com.sealteam.droidconcom

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class tickets : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
//indicates that Lint should ignore the specified warnings for elements

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tickets, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val hook: WebView =view.findViewById(R.id.globe)
       hook.webViewClient=object: WebViewClient(){


            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true

            }

        }
        hook.loadUrl("https://flutterwave.com/pay/54n5rus59cp5")
        hook.settings.javaScriptEnabled=true
        hook.settings.allowContentAccess=true
        hook.settings.domStorageEnabled=true
        hook.settings.useWideViewPort=true
    }

}