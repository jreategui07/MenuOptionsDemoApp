package com.example.menuoptionsdemoapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.menuoptionsdemoapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

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

    // The onCreateOptionsMenu function causes the Activity to display the options menu in the screen’s title bar
    // However, it does NOT control what happens when you “click” on a menu option
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.settings_menu, menu)
        return true
    }

    // The onOptionsItemSelected function is used to handle clicks on each item in the options menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.mi_new_tab -> {
                val snackBar = Snackbar.make(binding.root, "Opening a new tab...", Snackbar.LENGTH_LONG)
                snackBar.show()
                true
            }
            R.id.mi_new_incognito_tab -> {
                goToNextPage()
                true
            }
            R.id.mi_history -> {
                true
            }
            R.id.mi_clear_browsing_data -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun goToNextPage() {
        val intent: Intent = Intent(this@MainActivity, Screen2::class.java)
        startActivity(intent)
    }
}