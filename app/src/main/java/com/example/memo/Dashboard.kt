package com.example.memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        loadFragment(Home())
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.home->loadFragment(Home)
                R.id.setting->loadFragment(Image())
                R.id.profile->loadFragment(Profile())
            }
            true
        }
    }

    private fun loadFragment(fragment: Home) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()
    }
}