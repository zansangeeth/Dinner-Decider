package com.zasa.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val foodList  = arrayListOf("Mc donalds", "KFC, burger", "king", "Srilankan food")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            selectFoodText.setText(foodList.random())
        }

        addFoodBtn.setOnClickListener {
            foodList.add(addFoodTxt.text.toString())
        }


    }


}