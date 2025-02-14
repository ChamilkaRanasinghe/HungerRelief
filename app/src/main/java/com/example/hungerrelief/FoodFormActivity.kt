package com.example.hungerrelief

import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FoodFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_form)

        val foodNameEditText = findViewById<EditText>(R.id.foodName)
        val expiryDateEditText = findViewById<EditText>(R.id.expiryDate)
        val submitButton = findViewById<Button>(R.id.submitFoodButton)

        submitButton.setOnClickListener {
            val foodName = foodNameEditText.text.toString().trim()
            val expiryDate = expiryDateEditText.text.toString().trim()

            if (foodName.isEmpty() || expiryDate.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Food Donation Submitted!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
