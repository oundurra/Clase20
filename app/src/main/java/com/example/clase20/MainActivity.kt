package com.example.clase20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SharedApp.prefs.name = "ESTO VIENE DE 1"

        var tvName:TextView = findViewById(R.id.tvName)
        tvName.text = SharedApp.prefs.name

        var btnDeleteValue = findViewById(R.id.btnDeleteValue) as Button

        btnDeleteValue.setOnClickListener {
            SharedApp.prefs.name = "ESTO VIENE DE 1"
            var intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}