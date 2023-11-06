package com.example.memo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = android.os.Handler()
        handler.postDelayed({

            startActivity(Intent(this, Login::class.java))
            finish()

        }, 1000)
    }
}