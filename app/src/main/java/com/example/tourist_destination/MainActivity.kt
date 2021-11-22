package com.example.tourist_destination

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultLauncher

class MainActivity : AppCompatActivity() {
    private lateinit var launcher: ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(v: View?){

        when(v?.id){
            R.id.tour->{var intent = Intent(this, TourActivity::class.java)
                startActivity(intent)}
            R.id.hotel->{var intent = Intent(this, HotelActicity::class.java)
                startActivity(intent)}
            R.id.restaurant->{var intent = Intent(this, ResActivity::class.java)
                startActivity(intent)}
        }

    }
}