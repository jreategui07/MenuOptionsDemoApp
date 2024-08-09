package com.example.menuoptionsdemoapp

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.menuoptionsdemoapp.databinding.ActivityScreen2Binding

class Screen2 : AppCompatActivity() {
    lateinit var binding: ActivityScreen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            supportActionBar!!.setTitle("Screen 2")
            supportActionBar!!.setDisplayHomeAsUpEnabled(true); // Enabling the back button
        }
    }

    // The onOptionsItemSelected function is used to handle clicks on each item in the options menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> { // The name of the back button is: android.R.id.home
                this.finish();
                return true;
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}