package com.example.campusapp

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.campusapp.R
import com.example.campusapp.FourthActivity
import android.os.Bundle as Bundle1

open class SecondActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val Cse  = findViewById<Button>(R.id.button10)
        Cse.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            val intent=Intent(this, FourthActivity::class.java)
            val extras=Bundle1()
            extras.putString("YEAR","1")
            extras.putString("BRANCH","Cse")
            intent.putExtras(extras)
            startActivity(intent)

        }

        val Ece  = findViewById<Button>(R.id.button11)
        Ece.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            val intent=Intent(this,FourthActivity::class.java)
            val extras=Bundle1()
            extras.putString("YEAR","1")
            extras.putString("BRANCH","Ece")
            intent.putExtras(extras)
            startActivity(intent)

        }


        val Ee  = findViewById<Button>(R.id.button15)
        Ee.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            val intent=Intent(this,FourthActivity::class.java)
            val extras=Bundle1()
            extras.putString("YEAR","1")
            extras.putString("BRANCH","Ee")
            intent.putExtras(extras)
            startActivity(intent)

        }


        val Me  = findViewById<Button>(R.id.button13)
        Me.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            val intent=Intent(this,FourthActivity::class.java)
            val extras=Bundle1()
            extras.putString("YEAR","1")
            extras.putString("BRANCH","Me")
            intent.putExtras(extras)
            startActivity(intent)

        }


        val Ce  = findViewById<Button>(R.id.button16)
        Ce.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            val intent=Intent(this,FourthActivity::class.java)
            val extras=Bundle1()
            extras.putString("YEAR","1")
            extras.putString("BRANCH","Ce")
            intent.putExtras(extras)
            startActivity(intent)

        }


        val Ipe  = findViewById<Button>(R.id.button12)
        Ipe.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            val intent=Intent(this,FourthActivity::class.java)
            val extras=Bundle1()
            extras.putString("YEAR","1")
            extras.putString("BRANCH","Ipe")
            intent.putExtras(extras)
            startActivity(intent)

        }

        val Ice  = findViewById<Button>(R.id.button14)
        Ice.setOnClickListener{
            val checkflag : String? = intent.getStringExtra("flag")
            val intent=Intent(this,FourthActivity::class.java)
            val extras=Bundle1()
            extras.putString("YEAR","1")
            extras.putString("BRANCH","Ice")
            intent.putExtras(extras)
            startActivity(intent)

        }

    }
}
