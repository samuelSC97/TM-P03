package com.example.ejercicio_01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnSegunda).setOnClickListener {
            startActivity(Intent(this, SegundaActividad::class.java))
        }

        findViewById<Button>(R.id.btnConversion).setOnClickListener {
            startActivity(Intent(this, ConversionActivity::class.java))
        }

        findViewById<Button>(R.id.btnDrawer).setOnClickListener {
            startActivity(Intent(this, DrawerActivity::class.java))
        }
    }
}