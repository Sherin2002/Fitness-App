package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)

            var signBtn = findViewById<Button>(R.id.signBtn)
            signBtn.setOnClickListener {
                val intent4 = Intent(this, HomeActivity::class.java)
                startActivity(intent4)


        }
    }
}