package com.example.hw_week2_day5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextFirstNumber = findViewById<EditText>(R.id.editTextFirstNumbe)
        var editTextSecondNumber = findViewById<EditText>(R.id.editTextSecondNumber)

        var textViewResult = findViewById<TextView>(R.id.textViewResult)
        var SumButton = findViewById<Button>(R.id.SumButton)
        var SubButton = findViewById<Button>(R.id.SubButton)
        var MulButton = findViewById<Button>(R.id.MulButton)
        var DivButton = findViewById<Button>(R.id.DivButton)
        var ClearButton = findViewById<Button>(R.id.ClearButton)
        var Clickbutton = findViewById<Button>(R.id.Clickbutton)


        SumButton.setOnClickListener {

            var num1 = editTextFirstNumber.text.toString().toDouble()
            var num2 = editTextSecondNumber.text.toString().toDouble()

            var Sumresult = num1.plus(num2)
            textViewResult.text= " Result :"+" "+Sumresult.toString()
        }


        SubButton.setOnClickListener {

            var num1 = editTextFirstNumber.text.toString().toDouble()
            var num2 = editTextSecondNumber.text.toString().toDouble()

            var Subresult = num1.minus(num2)
            textViewResult.text= " Result :"+" "+Subresult.toString()
        }

        MulButton.setOnClickListener {

            var num1 = editTextFirstNumber.text.toString().toDouble()
            var num2 = editTextSecondNumber.text.toString().toDouble()

            var Mulresult = num1.times(num2)
            textViewResult.text= " Result :"+" "+Mulresult.toString()
        }


        DivButton.setOnClickListener {

            var num1 = editTextFirstNumber.text.toString().toDouble()
            var num2 = editTextSecondNumber.text.toString().toDouble()

            var Divresult = num1.div(num2)
            textViewResult.text= " Result :"+" "+Divresult.toString()
        }


        ClearButton.setOnClickListener {

            var num1 = editTextFirstNumber.getText().clear()
            var num2 = editTextSecondNumber.getText().clear()

            textViewResult.text= " "
        }

        Clickbutton.setOnClickListener {
            Toast.makeText(this, "Welcome to Esra Calculator ^-^ ", Toast.LENGTH_SHORT).show()
        }








    }
}

