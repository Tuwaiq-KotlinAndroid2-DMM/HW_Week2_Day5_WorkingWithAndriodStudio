package com.twq.practicetodolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


 const val EXTRA_MESSAGE = "com.twq.practicetodolist.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
// called when user clicks on send
    fun sendMessage(view: View){
        val editTextMessage = findViewById<EditText>(R.id.editTextMessage)
        val message = editTextMessage.text.toString()

        val intent = Intent(this,DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
    startActivity(intent)

    }
}