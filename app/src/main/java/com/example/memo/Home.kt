package com.example.memo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class Home : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val viewPager = view.findViewById<ViewPager>(R.id.viewPager)
        val tabs = view.findViewById<TabLayout>(R.id.tabs)

        // Set up the ViewPager and TabLayout
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(Product(), "Products")
        adapter.addFragment(Fav(), "Favourites")
        tabs.getTabAt(0)?.setIcon(R.drawable.baseline_dataset_24)
        tabs.getTabAt(1)?.setIcon(R.drawable.baseline_favorite_24)
        // Add more fragments as needed

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        return view
    }

}


