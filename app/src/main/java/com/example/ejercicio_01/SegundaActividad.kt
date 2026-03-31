package com.example.ejercicio_01

import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class SegundaActividad : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private val TIMER_RUNTIME = 10000
    private var activo = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_actividad)

        progressBar = findViewById(R.id.progressBar)

        val thread = Thread {
            var tiempo = 0

            while (activo && tiempo < TIMER_RUNTIME) {
                Thread.sleep(200)
                tiempo += 200

                val progreso = (progressBar.max * tiempo) / TIMER_RUNTIME

                runOnUiThread {
                    progressBar.progress = progreso
                }
            }

            runOnUiThread {
                Log.d("mensajeFinal", "carga completa")
            }
        }

        thread.start()
    }
}