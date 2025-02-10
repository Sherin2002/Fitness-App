package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ExcercisesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.excercises)

        var imageView6 = findViewById<ImageView>(R.id.imageView6)
        imageView6.setOnClickListener {
            val intent13 = Intent (this,HomeActivity::class.java)
            startActivity(intent13)
        }
    }
}