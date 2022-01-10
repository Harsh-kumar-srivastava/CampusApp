package com.example.campusapp

import android.app.Activity
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.campusapp.R
//import com.example.campusapp.FourthActivity
import android.os.Bundle as Bundle1

open class SecondActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val Cse  = findViewById<Button>(R.id.button10)

        Cse.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")

            if(checkflag.equals("year1")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.fstcse)
                startActivity(intent)

            }
           if(checkflag.equals("year2")){
               val intent=Intent(this, ThirdActivity::class.java)
               intent.putExtra("picture" , R.drawable.sndcse)
               startActivity(intent)
           }
            if(checkflag.equals("year3")){
               val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.trdcse)
               startActivity(intent)
           }
            if(checkflag.equals("year4")){
               val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.frtcse)
               startActivity(intent)
           }

        }
        val Ece  = findViewById<Button>(R.id.button11)
        Ece.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            if (checkflag.equals("year1")) {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.fstme)
                startActivity(intent)
            }

            if(checkflag.equals("year2")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.sndece)
                startActivity(intent)
            }

            if(checkflag.equals("year3")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.trdece)
                startActivity(intent)
            }
            if(checkflag.equals("year4")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.frtece)
                startActivity(intent)
            }
        }


        val Ee  = findViewById<Button>(R.id.button15)
        Ee.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            if (checkflag.equals("year1")) {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.fstee)
                startActivity(intent)
            }

            if(checkflag.equals("year2")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.sndee)
                startActivity(intent)
            }
            if(checkflag.equals("year3")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.trdee)
                startActivity(intent)
            }
            if(checkflag.equals("year4")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.frtee)
                startActivity(intent)
            }

        }


        val Me  = findViewById<Button>(R.id.button13)
        Me.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            if (checkflag.equals("year1")) {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.fstme)
                startActivity(intent)
            }

            if(checkflag.equals("year2")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.sndme)
                startActivity(intent)
            }
            if(checkflag.equals("year3")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.trdme)
                startActivity(intent)
            }
            if(checkflag.equals("year4")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.frtme)
                startActivity(intent)
            }
        }


        val Ce  = findViewById<Button>(R.id.button16)
        Ce.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            if (checkflag.equals("year1")) {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.fstce)
                startActivity(intent)
            }

            if(checkflag.equals("year2")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.sndce)
                startActivity(intent)
            }
            if(checkflag.equals("year3")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.trdce)
                startActivity(intent)
            }
            if(checkflag.equals("year4")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.frtce)
                startActivity(intent)
            }

        }


        val Ipe  = findViewById<Button>(R.id.button12)
        Ipe.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            if (checkflag.equals("year1")) {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.fstip)
                startActivity(intent)
            }

            if(checkflag.equals("year2")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.sndic)
                startActivity(intent)
            }
            if(checkflag.equals("year3")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.trdip)
                startActivity(intent)
            }
            if(checkflag.equals("year4")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.frtip)
                startActivity(intent)
            }

        }

        val Ice  = findViewById<Button>(R.id.button14)
        Ice.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            if (checkflag.equals("year1")) {
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.fstic)
                startActivity(intent)
            }

            if(checkflag.equals("year2")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.sndic)
                startActivity(intent)
            }
            if(checkflag.equals("year3")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.trdic)
                startActivity(intent)
            }
            if(checkflag.equals("year4")){
                val intent=Intent(this, ThirdActivity::class.java)
                intent.putExtra("picture" , R.drawable.frtip)
                startActivity(intent)
            }

        }

    }
}
