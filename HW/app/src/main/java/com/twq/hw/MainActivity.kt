package com.twq.hw

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.text.Editable
import android.widget.EditText

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var enterNumber1 = findViewById<EditText>(R.id.enterdNumber1)
        var enterNumber2 = findViewById<EditText>(R.id.enterdNumber2)
        var sumNumber = findViewById<EditText>(R.id.sumTextNumber3)
        var subNumber = findViewById<EditText>(R.id.subTextNumber4)
        var multNumber = findViewById<EditText>(R.id.multTextNumber5)
        var divdNumber = findViewById<EditText>(R.id.dividTextNumber6)
        var calcuateButtom = findViewById<EditText>(R.id.calculateButton)

        calcuateButtom.setOnClickListener {

            sumNumber.text = sum(enterNumber1 ,enterNumber2 )
            subNumber.text = sub(enterNumber1, enterNumber2)
            multNumber.text = multb(enterNumber1 , enterNumber2)
            divdNumber.text = devid(enterNumber1, enterNumber2)
        }
    }

}
fun multb(enterNumber1: EditText, enterNumber2: EditText): Editable? {
    return enterNumber1 * enterNumber2
}
fun devid(enterNumber1: EditText, enterNumber2: EditText): Editable? {
    return enterNumber1/enterNumber2
}
fun sub(enterNumber1: EditText, enterNumber2: EditText): Editable? {
    return enterNumber1-enterNumber2
}
fun sum(enterNumber1: EditText, enterNumber2: EditText): Editable? {
    return enterNumber1+enterNumber2

}


