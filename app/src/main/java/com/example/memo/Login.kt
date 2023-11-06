package com.example.memo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    private lateinit var signupButton: Button
    private lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        val username = sharedPreferences.getString("username", "")
        val password = sharedPreferences.getString("password", "")

        loginButton = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            // Handle login button click
            val inputUsername = findViewById<EditText>(R.id.logEmail).text.toString()
            val inputPassword = findViewById<EditText>(R.id.logPassword).text.toString()

            if (inputUsername == username && inputPassword == password) {
                // Correct login credentials
                with(sharedPreferences.edit()) {
                    putBoolean("isLoggedIn", true)
                    apply()
                }
                startActivity(Intent(this, Dashboard::class.java))
            } else {
                Toast.makeText(applicationContext, "Invalid input", Toast.LENGTH_SHORT).show()
            }
        }

        signupButton = findViewById(R.id.signupButton)
        signupButton.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
            finish()
        }

    }
}