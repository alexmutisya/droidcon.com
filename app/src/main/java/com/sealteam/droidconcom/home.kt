package com.sealteam.droidconcom

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class home : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
//indicates that Lint should ignore the specified warnings for elements
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val wfind: WebView =view.findViewById(R.id.internet)
        wfind.webViewClient=object: WebViewClient(){


            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true

            }

        }
        wfind.loadUrl("https://www.uganda.droidcon.com/")
        wfind.settings.javaScriptEnabled=true
        wfind.settings.allowContentAccess=true
        wfind.settings.domStorageEnabled=true
        wfind.settings.useWideViewPort=true
    }

}