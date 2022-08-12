package com.loadcomplete.fisherca.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.loadcomplete.fisherca.R

class Lose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)
        val start=findViewById<Button>(R.id.tryag)
        start.setOnClickListener {
            val intent= Intent(this@Lose,Game::class.java)
            startActivity(intent)
        }
    }
}