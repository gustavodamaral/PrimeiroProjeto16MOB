package br.com.gustavodamaral.primeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        load()
    }

    private fun load() {

        Handler().postDelayed({
            loadNextScreen()
        },2000L)

    }

    private fun loadNextScreen() {

        val nextScreenIntent = Intent(this, FormularioActivity::class.java)
        startActivity(nextScreenIntent)
        finish()

    }
}
