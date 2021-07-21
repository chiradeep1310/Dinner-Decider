    package com.chiradeep1310.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

    class MainActivity : AppCompatActivity() {
    var food = arrayListOf("Chocolate House", "Humming Bird", "Fat Pigeon", "Hard Rock")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this is for showing the place
        val Buttn = findViewById(R.id.Decidebtn) as Button
        Buttn.setOnClickListener {
            val random = java.util.Random()
            val randomFood = random.nextInt(food.count())
            val txt = findViewById(R.id.finalOutcome) as TextView
            txt.text = food[randomFood]
        }

        //this is for adding new places
        val btn = findViewById(R.id.addFoodbtn) as Button
        btn.setOnClickListener {
            val new = findViewById(R.id.AddFoodtxt) as TextView
            val newFood = new.text.toString()
            food.add(newFood)
            val kot :String? = null
            new.text = kot


        }
    }
}
