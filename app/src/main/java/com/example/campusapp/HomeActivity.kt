package com.example.campusapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.campusapp.R
import com.example.campusapp.SecondActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val firstYear = findViewById<Button>(R.id.firstyear)

        firstYear.setOnClickListener{
            val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("flag","year1")
            startActivity(intent)
        }


        val secondYear = findViewById<Button>(R.id.secondyear)
        secondYear.setOnClickListener{
            val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("flag","year2")
            startActivity(intent)
        }


        val thirdYear = findViewById<Button>(R.id.thirdyear)
        thirdYear.setOnClickListener{
            val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("flag","year3")
            startActivity(intent)
        }


        val fourthYear = findViewById<Button>(R.id.fourthyear)
        fourthYear.setOnClickListener{
            val intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("flag","year4")
            startActivity(intent)
        }

    }

}