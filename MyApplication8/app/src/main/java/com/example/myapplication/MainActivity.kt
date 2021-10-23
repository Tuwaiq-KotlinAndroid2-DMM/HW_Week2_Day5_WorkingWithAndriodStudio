package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var bsum = findViewById<Button>(R.id.bsum)
        var bmi = findViewById<Button>(R.id.bmi)
        var bmulti = findViewById<Button>(R.id.bmulti)
        var result = findViewById<EditText>(R.id.result)


        bsum.setOnClickListener{
            var num11= num1.text.toString().toInt()
            var num22= num2.text.toString().toInt()
            var sum:Int = num11 + num22
            result.text = sum.toString()

        }
        bmi.setOnClickListener{
            var num12= num1.text.toString().toInt()
            var num21= num2.text.toString().toInt()
            var min:Int = num12 - num21
            result.text = min.toString()

        }
        bmulti.setOnClickListener{
            var num33= num1.text.toString().toInt()
            var num44= num2.text.toString().toInt()
            var mult:Int = num33 + num44
            result.text = mult.toString()

        }

    }

}