package com.sealteam.droidconcom

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class programmecommitee : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
//indicates that Lint should ignore the specified warnings for elements

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_programmecommitee, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val search: WebView =view.findViewById(R.id.linkup)
       search.webViewClient=object: WebViewClient(){


            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true

            }

        }
       search.loadUrl("https://www.uganda.droidcon.com/program-committee")
        search.settings.javaScriptEnabled=true
        search.settings.allowContentAccess=true
        search.settings.domStorageEnabled=true
        search.settings.useWideViewPort=true
    }

}

