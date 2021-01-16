package com.example.gymwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class AddDrinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_drink)
    }

    fun addDrink(view: View) {
        val intent = Intent(this, WindowActivity::class.java)
        startActivity(intent)
    }

    fun cancel(view: View) {
        val intent = Intent(this, WindowActivity::class.java)
        startActivity(intent)
    }
}