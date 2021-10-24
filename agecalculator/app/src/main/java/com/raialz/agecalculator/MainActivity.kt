package com.raialz.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var editTextetage=findViewById<EditText>(R.id.editTextetage);
         var bugetage=findViewById<Button>(R.id.bugetage)

        bugetage.setOnClickListener{

            var etage=editTextetage.text.toString()

            if(etage=="YearofBirth"){
                Toast.makeText(this,"getage Success",Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this,"getage Failed",Toast.LENGTH_SHORT).show()
            }




        }

    }





}