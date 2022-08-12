package com.loadcomplete.fisherca.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.loadcomplete.fisherca.R

class Win : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)
        val start=findViewById<Button>(R.id.start)
        start.setOnClickListener {
            val intent=Intent(this@Win,Game::class.java)
            startActivity(intent)
        }
    }
}