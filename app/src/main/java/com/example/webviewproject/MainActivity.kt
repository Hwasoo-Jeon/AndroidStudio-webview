package com.example.webviewproject

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.webviewproject.databinding.ActivityWebviewBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWebviewBinding // 바인딩 변수의 타입

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // WebView 설정
        binding.webView.webViewClient = WebViewClient() // 수정된 부분: WebChromeClient 대신 WebViewClient 사용
        binding.webView.settings.javaScriptEnabled = true // 자바스크립트 허용

        // 웹 페이지 로드
        val url = "https://hwasoo-jeon.github.io/portfolio/"
        binding.webView.loadUrl(url)

//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

    }
}