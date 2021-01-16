package com.example.gymwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WindowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window)
    }

    fun add(view: View) {
        val intent = Intent(this, AddDrinkActivity::class.java)
        startActivity(intent)
    }

    fun signOut(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}