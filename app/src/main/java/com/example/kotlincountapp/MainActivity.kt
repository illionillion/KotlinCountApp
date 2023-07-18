package com.example.kotlincountapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.kotlincountapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        val countView : TextView = findViewById(R.id.countView)
//        val plusButton : Button = findViewById(R.id.plusButton)
//        val minusButton : Button = findViewById(R.id.minusButton)
//        val clearButton : Button = findViewById(R.id.clearButton)
//
//        var countNum:Int = 0
//
//        plusButton.setOnClickListener {
//            countNum++
//            countView.text = countNum.toString()
//        }
//        minusButton.setOnClickListener {
//            if (countNum == 0) return@setOnClickListener
//            countNum--
//            countView.text = countNum.toString()
//        }
//        clearButton.setOnClickListener {
//            countNum = 0
//            countView.text = countNum.toString()
//        }

        binding.plusButton.setOnClickListener {
            count++
            binding.countView.text = count.toString()
        }

        binding.minusButton.setOnClickListener {
            count--
            binding.countView.text = count.toString()
        }
        binding.clearButton.setOnClickListener {
            count = 0
            binding.countView.text = count.toString()
        }

    }
}