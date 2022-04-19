package com.movchan.testd.acitivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.Toast
import com.movchan.testd.MainActivity
import com.movchan.testd.R

class LaunchActivity : AppCompatActivity() {
    private lateinit var IV : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_launch)
        IV = findViewById(R.id.iv1)


        val timer = object : CountDownTimer(2000, 100){
            override fun onTick(p0: Long) {
                IV.rotation += 60f
            }

            override fun onFinish() {
                IV.rotation = 0f
                var intent = Intent(this@LaunchActivity, MainActivity::class.java)
                startActivity(intent)
            }

        }
        timer.start()

    }
}