package com.example.campusapp

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import java.time.LocalDate
import java.time.DayOfWeek
import java.time.LocalTime
import java.time.Month
import java.util.*

class ThirdActivity :AppCompatActivity(){
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val c=Calendar.getInstance()
        val date=c.get(Calendar.DATE)
        val hour=c.get(Calendar.HOUR_OF_DAY)
        val minute=c.get(Calendar.MINUTE)
        val dayOfWeek=c.get(Calendar.DAY_OF_WEEK)
        val day=when(dayOfWeek){
            1->"MONDAY"
            2->"TUESDAY"
            3->"WEDNESDAY"
            4->"THRUSDAY"
            5->"FRIDAY"
            6->"SATURDAY"
            else->"SUNDAY"
        }

        val textDate:TextView=findViewById(R.id.textDate)
        val textTime:TextView=findViewById(R.id.textTime)
        val textDayOfWeek:TextView=findViewById(R.id.textDayOfWeek)
        textDate.text= date.toString()
        textTime.text= "$hour:$minute"
        textDayOfWeek.text=day

        val image:String? =intent.getStringExtra("flag")

        val imageViewZoomInOut:ImageView=findViewById(R.id.imageViewZoomInOut)
        Glide.with(this).load(image).error(R.drawable.image1).into(imageViewZoomInOut)

    }
}