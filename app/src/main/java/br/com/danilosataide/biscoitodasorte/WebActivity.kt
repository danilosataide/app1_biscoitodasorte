package br.com.danilosataide.biscoitodasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        //Habilitando a execução de códigos Java
        wbvSiteHistoria.settings.javaScriptEnabled = true;

        //Recuperando a url passado por meio da Intent
        val url = intent.getStringExtra("INTENT_URL")

        //Carregando um endereço Web
        wbvSiteHistoria.loadUrl("$url")

        //Definindo o cliente Web padrão
        wbvSiteHistoria.webViewClient = WebViewClient()
    }
}