package com.example.campusapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val imageView : ImageView = findViewById(R.id.imageView5)
        val bundle = intent.extras
        if(bundle != null){
            val picture = bundle.getInt("picture")
            imageView.setImageResource(picture)
        }

    }
}