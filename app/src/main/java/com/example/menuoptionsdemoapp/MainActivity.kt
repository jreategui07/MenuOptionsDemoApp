package com.example.menuoptionsdemoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.menuoptionsdemoapp.databinding.ActivityMainBinding
import com.example.menuoptionsdemoapp.databinding.ActivityScreen2Binding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            supportActionBar!!.setTitle("Menu") // Setting the action bar title
        }

        binding.btnNext.setOnClickListener {
            goToNextPage()
        }
    }

    private fun goToNextPage() {
        val intent: Intent = Intent(this@MainActivity, Screen2::class.java)
        startActivity(intent)
    }
}