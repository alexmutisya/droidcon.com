package com.sealteam.droidconcom

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class bepatner : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
//indicates that Lint should ignore the specified warnings for elements

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bepatner, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val next: WebView =view.findViewById(R.id.webrun)
        next.webViewClient=object: WebViewClient(){


            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true

            }

        }
        next.loadUrl("https://www.uganda.droidcon.com/become-a-sponsor/")
        next.settings.javaScriptEnabled=true
        next.settings.allowContentAccess=true
        next.settings.domStorageEnabled=true
        next.settings.useWideViewPort=true
    }

}