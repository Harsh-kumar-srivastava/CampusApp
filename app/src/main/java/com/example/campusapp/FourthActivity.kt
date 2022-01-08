package com.example.campusapp

import android.app.DownloadManager
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.campusapp.MySingleton
import kotlin.jvm.Throws

class FourthActivity :AppCompatActivity(){

    lateinit var year:String
    lateinit var branch:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent=getIntent()
        val extras=intent.getExtras()
        year= extras?.getString("YEAR").toString()
        branch= extras?.getString("BRANCH").toString()

        fetchData()

    }

    private  fun fetchData(){

        var url="https://newsapi.org/v2/everything?q=tesla&from=2021-12-07&sortBy=publishedAt&apiKey=39aa934da67a4171989ab3577ead6173"

        val jsonObjectRequest=JsonObjectRequest(
            Request.Method.GET,url,null,
            {
                val jsonimageArray=it.getJSONArray("articles")
                val imageArray=jsonimageArray.getJSONObject(0)
                val image=imageArray.getString("urlToImage")

                val intent=Intent(this,ThirdActivity::class.java)
                intent.putExtra("flag",image)
                startActivity(intent)

            }, {
            }
        )
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)
    }

}



/*{
    @Throws(AuthFailureError::class)
    override fun getHeaders():Map<String,String>{
        val params:MutableMap<String,String>= HashMap()
        params["User-Agent"]="Mozilla/5.0"
        return params
    }
}*/