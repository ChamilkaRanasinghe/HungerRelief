package com.yourname.hungerrelief

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hungerrelief.FoodListActivity
import com.example.hungerrelief.R

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            // Go to Food Donation List Screen
            val intent = Intent(this, FoodListActivity::class.java)
            startActivity(intent)
        }
    }
}

class FoodListActivity {

}
