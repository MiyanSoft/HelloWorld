package com.miyansoft.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //get reference to the Button
        val increaseBtn = findViewById<Button>(R.id.btn_increase)
        //make button clickable
        increaseBtn.setOnClickListener(View.OnClickListener {
            //get reference to the TextView
            val textValue = findViewById<TextView>(R.id.txt_value)
            //set originalValue to be the value found in the TextView
            //since the 'text' property returns a char sequence and the needed value is an integer, there's need to convert it to a String, then to Int
            val originalValue = textValue.text.toString().toInt()
            //call function SumValue to increment the value of the original value by 1 and store it in newValue
            val newValue = Increment.SumValue(originalValue)
            //convert or output newValue as a string
            textValue.text = newValue.toString()
        })

    }
}