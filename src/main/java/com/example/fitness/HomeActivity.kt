package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        var btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            val intent7 = Intent( this, ExcercisesActivity::class.java)
            startActivity(intent7)

        }

        var report = findViewById<ImageView>(R.id.report)
        report.setOnClickListener {
            val intent8 = Intent(this, ReportActivity::class.java)
            startActivity(intent8)
        }


        var imageView15 = findViewById<ImageView>(R.id.imageView15)
        imageView15.setOnClickListener {
            val intent9 = Intent(this,ProfileActivity::class.java)
            startActivity(intent9)
        }

        var imageView14 = findViewById<ImageView>(R.id.imageView14)
        imageView14.setOnClickListener {
            val intent14 = Intent(this,NotificationActivity::class.java)
            startActivity(intent14)
        }

        }





}