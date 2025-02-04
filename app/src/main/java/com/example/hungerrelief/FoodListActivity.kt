package com.example.hungerrelief

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FoodListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)

        val addFoodButton = findViewById<Button>(R.id.addFoodButton)
        addFoodButton.setOnClickListener {
            // Open Food Donation Form
            val intent = Intent(this, FoodFormActivity::class.java)
            startActivity(intent)
        }
    }
}

class FoodFormActivity {

}

