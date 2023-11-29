package com.example.memo

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView



class Profile : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rowView= inflater.inflate(R.layout.fragment_profile, container, false)

        val profileName=rowView.findViewById<TextView>(R.id.profile_email)
        val profilePass=rowView.findViewById<TextView>(R.id.profile_pass)

        val context = requireActivity()
        val showPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        val usernameText=showPreferences.getString("username"," ")
        val passwordText=showPreferences.getString("password"," ")

        profileName.text = "Email :"+usernameText
        profilePass.text = "Password:"+passwordText

        return rowView
    }


}