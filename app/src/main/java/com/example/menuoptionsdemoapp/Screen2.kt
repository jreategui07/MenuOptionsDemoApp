package com.example.menuoptionsdemoapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.menuoptionsdemoapp.databinding.ActivityScreen2Binding
import com.google.android.material.snackbar.Snackbar

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

    // The onCreateOptionsMenu function causes the Activity to display the options menu in the screen’s title bar
    // However, it does NOT control what happens when you “click” on a menu option
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.screen2_options_menu, menu)
        return true
    }

    // The onOptionsItemSelected function is used to handle clicks on each item in the options menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> { // The name of the back button is: android.R.id.home
                this.finish();
                return true;
            }
            R.id.mi_login -> {
                val snackbar = Snackbar.make(binding.root, "You are logged in!", Snackbar.LENGTH_SHORT)
                snackbar.show()
                return true;
            }
            R.id.mi_logout -> {
                finish();
                return true;
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}