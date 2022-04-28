package com.beyzanurtas.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var button:Button
    private lateinit var diceimage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        diceimage=findViewById(R.id.imageView)

        button.setOnClickListener {
        val rolldice=AnimationUtils.loadAnimation(this,R.anim.rotate_anim)
        diceimage.startAnimation(rolldice)
            rolldice()
        }
    }
    private fun rolldice() {
        val randomInt=Random().nextInt(6)+1
        val drawableResource=when(randomInt){
            1 ->R.drawable.dice_1
            2 ->R.drawable.dice_2
            3 ->R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 ->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        diceimage.setImageResource(drawableResource)
    }
}