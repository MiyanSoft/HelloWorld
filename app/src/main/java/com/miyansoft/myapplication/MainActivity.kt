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

        val increaseBtn = findViewById<Button>(R.id.btn_increase)
        increaseBtn.setOnClickListener(View.OnClickListener {
            val textValue = findViewById<TextView>(R.id.txt_value)
            val originalValue = textValue.text.toString().toInt()
            val newValue = originalValue + 1
            textValue.text = newValue.toString()
        })

    }
}