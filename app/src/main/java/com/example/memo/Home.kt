package com.example.memo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


open class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setUpTabs()
    }

    private fun setUpTabs() {
        val myAdapter = ViewPagerAdapter(supportFragmentManager)

        myAdapter.addFragment(Product(), "Products")
        myAdapter.addFragment(Fav(), "Favourites")


        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = myAdapter

        val tabs = findViewById<TabLayout>(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.baseline_home_work_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.baseline_interests_24)
    }
}




