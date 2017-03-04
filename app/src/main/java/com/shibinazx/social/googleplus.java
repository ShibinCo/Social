package com.shibinazx.social;

        import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class googleplus extends Fragment {
    WebView mWebView;
    View InflatedView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        InflatedView = inflater.inflate(R.layout.googleplus_frag,container,false);
        mWebView = (WebView) InflatedView.findViewById(R.id.webview2);
        mWebView.loadUrl("https://plus.google.com");
        return InflatedView;
    }}
