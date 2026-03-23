package com.example.desitionlogic


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        checkButton.setOnClickListener {

            val age = ageEditText.text.toString().toInt()
            if(age >= 18){
                resultTextView.text = "you are an adult"
            }else{
                    resultTextView.text="you can drink"
                }
            }
        }
    }

