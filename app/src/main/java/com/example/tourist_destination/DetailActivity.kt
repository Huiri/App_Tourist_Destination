package com.example.tourist_destination

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.tourist_destination.databinding.ActivityDetailBinding
import com.example.tourist_destination.datamodel.Data

class DetailActivity : AppCompatActivity() {
    lateinit var datas : Data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title : String? = intent.getStringExtra("desti_name")
        val sub : String? = intent.getStringExtra("desti_sub")
        val photo : Int? = intent.getIntExtra("photo", -1)

        val photo2 : ImageView = findViewById(R.id.photo)
        val desti_name : TextView = findViewById(R.id.desti_name)
        val desti_sub : TextView = findViewById(R.id.desti_sub)

        desti_name.setText(title)
        desti_sub.setText(sub)
        photo2.setImageResource(photo!!.toInt())

        val button: Button = findViewById(R.id.close_btn)
        button.setOnClickListener {
            finish()
        }
    }

}
