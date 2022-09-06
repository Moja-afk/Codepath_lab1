package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter = 0

        val button = findViewById<Button>(R.id.button2)

        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()


//            val upgradeButton = findViewById<Button>(R.id.upgradeBtn)
//
//            button.setOnClickListener {
//                // Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
//                counter++
//                textView.text = counter.toString()
//
//                if (counter >= 100) {
//
//                    // Show upgrade button and set onClickListener
//                    upgradeButton.visibility = View.VISIBLE
//                    upgradeButton.setOnClickListener {
//                        button.text = "Add 2"
//
//                        // Update original button to add 2 instead of `
//                        button.setOnClickListener {
//                            counter += 2
//                            textView.text = counter.toString()
//                        }
//
//                        // Hide upgrade button again
//                        upgradeButton.visibility = View.INVISIBLE
//                    }
//                }
//            }
        }

    }
}