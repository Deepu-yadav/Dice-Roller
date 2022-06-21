package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit  var diceImage:ImageView  // it is called the field


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button=findViewById(R.id.roll_button)
        rollButton.setOnClickListener{

            rollDice()
        }
        diceImage=findViewById(R.id.dice_image)
        rollButton.text="let's Roll"
    }

    private fun rollDice() {

        val randomInt=(1..6).random()
        val drwableresources=when(randomInt){
            1-> R.drawable.ic_dicenew_1
            2 ->R.drawable.ic_dicenew_2
            3 ->R.drawable.ic_dicenew_3
            4 ->R.drawable.ic_dicenew_4
            5 ->R.drawable.ic_dicenew_5
            else -> R.drawable.ic_dicenew_6
        }

       // val diceImage:ImageView=findViewById(R.id.dice_image)
        diceImage.setImageResource(drwableresources)





    }
}