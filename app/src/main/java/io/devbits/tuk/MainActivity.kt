package io.devbits.tuk

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increaseScoreButton: Button = findViewById(R.id.increase_score_button)
        val decreaseScoreButton: Button = findViewById(R.id.decrease_score_button)
        val scoreTextView: TextView = findViewById(R.id.score_text_view)

        increaseScoreButton.setOnClickListener {
            increaseScore()
            scoreTextView.setText("$score")
        }
        decreaseScoreButton.setOnClickListener {
            decreaseScore()
            scoreTextView.text = "$score"
        }
    }

    private fun increaseScore() {
        score += 1
    }

    private fun decreaseScore() {
        score -= 1
    }

}
