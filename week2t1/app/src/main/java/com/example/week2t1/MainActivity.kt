package com.example.week2t1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

public class MainActivity : AppCompatActivity() {

    val roztow = R.drawable.roztow
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image = findViewById<ImageView>(R.id.image1)
        var btnnext = findViewById<Button>(R.id.btnNext)
        var btnback = findViewById<Button>(R.id.btnBack)
        image.setImageResource(roztow)
        btnnext.setOnClickListener() {
            val rozthree = R.drawable.rozthree
            image.setImageResource(rozthree)
        }
        btnback.setOnClickListener() {
            val roztow = R.drawable.roztow
            image.setImageResource(roztow)

        }
    }
}