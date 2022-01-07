package com.example.timetable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstyear = findViewById<Button>(R.id.firstyear)
        firstyear.setOnClickListener(){

            val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("flag","year1")
            startActivity(intent)
        }
        val secondyear = findViewById<Button>(R.id.secondyear)
        secondyear.setOnClickListener(){

            val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("flag","year2")
            startActivity(intent)
        }
        val thirdyear = findViewById<Button>(R.id.thirdyear)
        thirdyear.setOnClickListener(){

            val intent= Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        val fourthyear = findViewById<Button>(R.id.fourthyear)
        fourthyear.setOnClickListener(){

            val intent= Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}