package com.example.payanterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list= arrayOf<ModelProduct>(ModelProduct("محمود کاظمی","09358542404" , "https://i.pinimg.com/564x/f7/6b/91/f76b91f22019b550e0848519719a03f1.jpg"),
            ModelProduct("محمدرضا", "09302030852" , "https://www.teahub.io/photos/full/311-3116418_smart-boy-rakib-in-bangladesh-bangladeshi-smart-boy.jpg"),
            ModelProduct("علی رضا","09184501818" , "https://i.pinimg.com/736x/68/e0/c0/68e0c0dedbe91da254e2fd235d54abf6.jpg"),
            ModelProduct("جاسم", "09031108590" , "https://i.pinimg.com/originals/4e/fe/05/4efe0579ffdcd4e41771ac78cb034448.jpg"),
            ModelProduct("کاظم","09398102505" , "https://static.toiimg.com/thumb/msid-69591643,width-1200,height-900,resizemode-4/.jpg"))

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter = AdapterProduct(list)
        recyclerView.adapter = adapter

    }
}