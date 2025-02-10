package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Login_btn = findViewById<Button>(R.id.Login_btn)
        Login_btn.setOnClickListener {
            val intent1 = Intent(this, HomeActivity::class.java)
            startActivity(intent1)
        }

        val btnSign = findViewById<Button>(R.id.btnSign)
        btnSign.setOnClickListener {
            val intent2 = Intent(this,SigninActivity::class.java)
            startActivity(intent2)
        }

    }
}