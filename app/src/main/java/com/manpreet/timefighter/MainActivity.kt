package com.manpreet.timefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal var score = 0

    internal lateinit var tapMeButton: Button
    internal lateinit var timeLeft: TextView
    internal lateinit var scoreText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tapMeButton = findViewById(R.id.tapMeButton)
        scoreText = findViewById(R.id.score)
        timeLeft = findViewById(R.id.timeLeft)

        print("Hello")

        tapMeButton.setOnClickListener { view ->
            incrementScore()
        }
    }

    private fun incrementScore() {
        score += 1
        print(score)
        val newScore = getString(R.string.scoreText, score)
        scoreText.text = newScore
    }
}
