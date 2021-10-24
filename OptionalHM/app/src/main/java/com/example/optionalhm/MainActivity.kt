package com.example.optionalhm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resulrNum:Float

        var Result:TextView
        var number1:EditText
        var number2:EditText
        var AddBtn:Button
        var SubBtn:Button
        var MultiplyBtn:Button
        var DivideBtn:Button


        Result=findViewById<TextView>(R.id.Result)
        number1=findViewById<EditText>(R.id.number1)
        number2=findViewById<EditText>(R.id.number2)
        AddBtn=findViewById<Button>(R.id.BtnSum)
        SubBtn=findViewById<Button>(R.id.BtnSubtract)
        MultiplyBtn=findViewById<Button>(R.id.BtnBtnMultiply)
        DivideBtn=findViewById<Button>(R.id.BtnDivide)




        AddBtn.setOnClickListener {

            var num1=number1.text.toString().toDouble()
            var num2= number2.text.toString().toDouble()
            var res =num1+num2

            Result.text=res.toString()


        }

        SubBtn.setOnClickListener {

            var num1=number1.text.toString().toDouble()
            var num2= number2.text.toString().toDouble()

            var res=num1-num2
            Result.text=res.toString()
        }

        MultiplyBtn.setOnClickListener {
            var num1=number1.text.toString().toDouble()
            var num2= number2.text.toString().toDouble()

            var res=num1*num2
            Result.text=res.toString()
        }

        DivideBtn.setOnClickListener {
            var num1=number1.text.toString().toDouble()
            var num2= number2.text.toString().toDouble()

            var res=num1/num2
            Result.text=res.toString()
        }




    }
}