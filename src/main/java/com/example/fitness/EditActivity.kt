package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit)

        var button12 = findViewById<Button>(R.id.button12)
        button12.setOnClickListener {
            val intent11 = Intent(this,ReportActivity::class.java)
            startActivity(intent11)
        }
    }
}