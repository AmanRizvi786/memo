package com.example.memo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            // Handle registration button click
            val inputUsername = findViewById<EditText>(R.id.signupEmail).text.toString()
            val inputPassword = findViewById<EditText>(R.id.signupPassword).text.toString()

            with(sharedPreferences.edit()) {
                putString("username", inputUsername)
                putString("password", inputPassword)
                apply()

            }

            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }

        var gotoLoginButton = findViewById<Button>(R.id.goto_LoginPageButton)
        gotoLoginButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }

    }
}