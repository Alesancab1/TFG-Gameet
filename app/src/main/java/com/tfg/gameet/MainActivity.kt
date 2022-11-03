package com.tfg.gameet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // Splash Screen
        Thread.sleep(2000)
        setContentView(R.layout.activity_main)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Analytics Event
        val analytics : FirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integración de Firebase completa")
        analytics.logEvent("InitScreen", bundle)
    }
}