package com.example.clase20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var tvTitulo2: TextView = findViewById(R.id.tvTitulo2)
        tvTitulo2.text = SharedApp.prefs.name


        var btnBack = findViewById(R.id.btnBack) as Button

        btnBack.setOnClickListener {
            SharedApp.prefs.name = "Va de vuelta"
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}