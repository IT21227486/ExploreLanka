package com.example.placemanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sigiriyaBtn = findViewById<Button>(R.id.sigiriya)
        sigiriyaBtn.setOnClickListener {
            val Intent = Intent (this, sigiriya::class.java)
            startActivity(Intent)
        }

    }
}