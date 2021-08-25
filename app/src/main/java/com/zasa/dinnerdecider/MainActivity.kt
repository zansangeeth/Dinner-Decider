package com.zasa.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Mc donalds", "KFC", "burger", "king", "Srilankan food")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectFoodText.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            foodList.add(addFoodTxt.text.toString())
            addFoodTxt.text.clear()

            Log.i("listOfFoods", foodList.toString())
        }



        //alternate way to implement dinnerDecider
        
//        decideBtn.setOnClickListener {
//            selectFoodText.setText(foodList.random())
//        }
//
//        addFoodBtn.setOnClickListener {
//            foodList.add(addFoodTxt.text.toString())
//        }


    }


}