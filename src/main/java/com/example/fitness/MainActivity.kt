package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent (this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}