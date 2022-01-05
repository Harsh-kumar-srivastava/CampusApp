package com.example.timetable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val Cse  = findViewById<Button>(R.id.Cse)
        Cse.setOnClickListener(){

            val checkflag : String? = intent.getStringExtra("flag")

            if(checkflag.equals("year1")){
                val intent= Intent(this, ThirdActivity::class.java)
                startActivity(intent)
            }


        }

        val Ece  = findViewById<Button>(R.id.Ece)
        Ece.setOnClickListener(){
            val intent= Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        val Ee  = findViewById<Button>(R.id.Ee)
        Ee.setOnClickListener(){
            val intent= Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        val Me  = findViewById<Button>(R.id.Me)
        Me.setOnClickListener(){
            val intent= Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        val Ce  = findViewById<Button>(R.id.Ce)
        Ce.setOnClickListener(){
            val intent= Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        val Ipe  = findViewById<Button>(R.id.Ipe)
        Ipe.setOnClickListener(){
            val intent= Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        val Ice  = findViewById<Button>(R.id.Ice)
        Ice.setOnClickListener(){
            val intent= Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}