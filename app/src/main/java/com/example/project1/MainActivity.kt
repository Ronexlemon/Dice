package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView



class MainActivity : AppCompatActivity() {
    lateinit var resultsImage: ImageView
    lateinit var resultsImage1 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        resultsImage  = findViewById(R.id.roll_image)
        resultsImage1 = findViewById(R.id.roll_image1)
        rollButton.setOnClickListener { rollDice() }
    }

private fun getRandomInt(): Int {
    val randomInt = (1..6).random()
    return randomInt
}
    private fun rollDice() {


        val placeHolder = when(getRandomInt()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice


        }
        val placeHolder1 = when(getRandomInt()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice


        }
        resultsImage.setImageResource(placeHolder)
        resultsImage1.setImageResource(placeHolder1)
       // resultsImage.text=randomInt.toString()

       // Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()


    }
    /*private fun  rollCount(){

        val resultsText : ImageView = findViewById(R.id.roll_image)
        var  total = Integer.parseInt(resultsText.text.toString()) +1
       // resultsText.text=total.toString()
    }*/
}