package com.example.sandynasandaire.nytimessearch.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.sandynasandaire.nytimessearch.Article;
import com.example.sandynasandaire.nytimessearch.R;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Article article =(Article) getIntent().getSerializableExtra("article");

        WebView  webView = (WebView) findViewById(R.id.wvArticle);

        webView.setWebViewClient(new WebViewClient()
        {

         public boolean shouldOverrideUrlloding(WebView view, String url) {
             view.loadUrl(url);
             return true;
         }
        });

    webView.loadUrl(article.getWebUrl());
    }
}
