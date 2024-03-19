package com.example.temperatureconversionapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var e: EditText
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var textView4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        e = findViewById(R.id.editTextNumber)
        b1 = findViewById(R.id.button)
        b2 = findViewById(R.id.button2)
        textView4 = findViewById(R.id.textView4)

        b1.setOnClickListener {
            val p = e.text.toString().toDouble()
            val k = ((p - 32) * 5) / 9
            val resultFahrenheit = String.format("%.2f", p)
            val resultCelsius = String.format("%.2f", k)
            // e.setText(String.format("%.2f", p))
            textView4.text = "$resultFahrenheit °F is $resultCelsius °C"
        }

        b2.setOnClickListener {
            val p1 = e.text.toString().toDouble()
            val k1 = (1.8 * p1) + 32
            val resultCelsius = String.format("%.2f", p1)
            val resultFahrenheit = String.format("%.2f", k1)
           // e.setText(String.format("%.2f", k1))
            textView4.text = "$resultCelsius °C is $resultFahrenheit °F"
        }

    }
}
