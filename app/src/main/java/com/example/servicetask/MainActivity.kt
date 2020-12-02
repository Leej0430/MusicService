package com.example.servicetask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicetask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            val intent = Intent()
            intent.setClass(this@MainActivity,
                MusicService::class.java)
            startService(intent)
        }

        binding.btnStop.setOnClickListener {
            val intent = Intent()
            intent.setClass(this@MainActivity,
            MusicService::class.java)
            stopService(intent)
        }

    }

    private fun initService(){

    }

    private fun stopService(){

    }

}