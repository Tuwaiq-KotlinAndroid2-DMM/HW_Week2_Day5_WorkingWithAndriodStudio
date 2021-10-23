package com.example.day10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        var editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        var button = findViewById<Button>(R.id.buttonLogin)
        button.setOnClickListener {

        }

    }
}