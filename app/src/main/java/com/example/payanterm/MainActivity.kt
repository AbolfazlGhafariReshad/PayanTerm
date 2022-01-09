package com.example.payanterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data= arrayOf<ModelProduct>(ModelProduct("محمود کاظمی","09358542404"),
            ModelProduct("محمدرضا", "09302030852"), ModelProduct("علی رضا","09184501818"),
            ModelProduct("جاسم", "09031108590"), ModelProduct("کاظم","09398102505"))

    }
}