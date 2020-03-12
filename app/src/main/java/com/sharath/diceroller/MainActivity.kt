package com.sharath.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import com.sharath.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)*/
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }

        //binding.rollButton.text = "Lets roll"
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val result = Random.nextInt(6)+1
        resultText.text = result.toString()
    }
}
