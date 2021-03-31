package com.example.tcpsocketserver

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Log.i("MainActivity", "greater than")
            startForegroundService(Intent(applicationContext, TcpServerService::class.java))
        } else {
            Log.i("MainActivity", "less than")
            startService(Intent(applicationContext, TcpServerService::class.java))
        }
    }
}