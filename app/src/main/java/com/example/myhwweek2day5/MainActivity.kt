package com.example.myhwweek2day5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.bottomappbar.BottomAppBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTxtUsername = findViewById<EditText>(R.id.editTextTextUesername)
        var editTxtPassword = findViewById<EditText>(R.id.editTextTextPassword)
        var buttonLog = findViewById<Button>(R.id.buttonLog)


        buttonLog.setOnClickListener {
            var username = editTxtUsername.text.toString()
            var pass = editTxtPassword.text.toString()

            if (username == "nora" && pass == "123") {
                Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show()

                val nextPage = Intent(this,secondactivity::class.java)
                startActivity(nextPage)

            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_LONG).show()
            }


        }

    }
}