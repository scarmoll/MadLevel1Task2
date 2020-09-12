package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            checkanswers()
        }
    }

    private fun checkanswers() {
        var amountCorrect = 0

        if (binding.input1.text.toString() == "T") {
            amountCorrect += 1
        }

        if (binding.input2.text.toString() == "F") {
            amountCorrect += 1
        }

        if (binding.input3.text.toString() == "F") {
            amountCorrect += 1
        }

        if (binding.input4.text.toString() == "F") {
            amountCorrect += 1
        }

        Toast.makeText(this, "Amount correct: $amountCorrect", Toast.LENGTH_LONG).show()
    }
}