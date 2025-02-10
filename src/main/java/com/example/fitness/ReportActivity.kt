package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ReportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.report)


        var button11 = findViewById<Button>(R.id.button11)
        button11.setOnClickListener {
            val intent12 = Intent (this,EditActivity::class.java)
            startActivity(intent12)
        }

       var imageView12 = findViewById<ImageView>(R.id.imageView12)
        imageView12.setOnClickListener {
            val intent13 = Intent (this,HomeActivity::class.java)
            startActivity(intent13)
        }

    }
}