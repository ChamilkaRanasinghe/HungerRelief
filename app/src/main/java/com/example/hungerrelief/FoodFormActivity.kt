package com.yourname.hungerrelief

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hungerrelief.R

class FoodFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_form)

        val submitButton = findViewById<Button>(R.id.submitFoodButton)
        submitButton.setOnClickListener {
            // Go back to Food List after submission
            finish()
        }
    }
}


