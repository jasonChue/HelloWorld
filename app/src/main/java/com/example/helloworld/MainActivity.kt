package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbtn : Button = findViewById(R.id.roll_button)
        rollbtn.setOnClickListener { rollDice() }

        val countbtn : Button = findViewById(R.id.countUp_button)
        countbtn.setOnClickListener { CountUp() }
    }

    //make use of method to increase the usability and effetiveness
    private fun rollDice(){
        val textView : TextView = findViewById(R.id.result_text)
        textView.text = (1..6).random().toString()
    }

    private fun CountUp(){
        val textView : TextView = findViewById(R.id.result_text)

        if(textView.text == "Hello World!"){
            textView.text = "1"
        }else{
            val result = textView.text.toString().toInt()
            if(result<6){
                textView.text = (result+1).toString()
            }
        }
    }
}