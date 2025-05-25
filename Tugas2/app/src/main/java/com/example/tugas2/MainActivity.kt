package com.example.tugas2

import android.os.Bundle
import android.os.StrictMode
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        val tvResponse = findViewById<TextView>(R.id.tvResponse)

        try {
            val url = URL("https://tugas.free.beeceptor.com/data")
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"

            val reader = BufferedReader(InputStreamReader(connection.inputStream))
            val response = reader.readText()
            reader.close()

            tvResponse.text = response

        } catch (e: Exception) {
            tvResponse.text = "Error: ${e.message}"
        }
    }
}