package com.loadcomplete.fisherca.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.loadcomplete.fisherca.R

class Game : AppCompatActivity() {
    lateinit var tr1:ImageView
    lateinit var tr2:ImageView
    lateinit var tr3:ImageView
    lateinit var tr4:ImageView
    lateinit var tr5:ImageView
    val roll=mutableListOf<String>("1","2","3")
    var scr=3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        tr1=findViewById<ImageView>(R.id.tr1)
        tr2=findViewById<ImageView>(R.id.tr2)
        tr3=findViewById<ImageView>(R.id.tr3)
        tr4=findViewById<ImageView>(R.id.tr4)
        tr5=findViewById<ImageView>(R.id.tr5)
        var hurt3=findViewById<ImageView>(R.id.imageView)
        var hurt2=findViewById<ImageView>(R.id.imageView2)
        var hurt1=findViewById<ImageView>(R.id.imageView3)
        tr1.setOnClickListener {
            val i=roll.random()
            check(i,tr1)
            if (i=="1"){

                val intent1=Intent(this@Game,Win::class.java)
                startActivity(intent1)

            }
            else{
                scr--
                if(scr==2){
                    hurt3.setImageResource(R.drawable.noheart)
                }
                else if(scr==1){
                    hurt2.setImageResource(R.drawable.noheart)
                }
                lose(scr)

            }
        }
        tr2.setOnClickListener {
            val i=roll.random()
            check(i,tr2)
            if (i=="1"){
                val intent1=Intent(this@Game,Win::class.java)
                startActivity(intent1)

            }
            else{
                scr--
                if(scr==2){
                    hurt3.setImageResource(R.drawable.noheart)
                }
                else if(scr==1){
                    hurt2.setImageResource(R.drawable.noheart)
                }
                lose(scr)

            }
        }
        tr3.setOnClickListener {
            val i=roll.random()
            check(i,tr3)
            if (i=="1"){
                val intent1=Intent(this@Game,Win::class.java)
                startActivity(intent1)

            }
            else{
                scr--
                if(scr==2){
                    hurt3.setImageResource(R.drawable.noheart)
                }
                else if(scr==1){
                    hurt2.setImageResource(R.drawable.noheart)
                }
                lose(scr)

            }
        }
        tr4.setOnClickListener {
            val i=roll.random()
            check(i,tr4)
            if (i=="1"){
                val intent1=Intent(this@Game,Win::class.java)
                startActivity(intent1)

            }
            else{
                scr--
                if(scr==2){
                    hurt3.setImageResource(R.drawable.noheart)
                }
                else if(scr==1){
                    hurt2.setImageResource(R.drawable.noheart)
                }
                lose(scr)

            }
        }
        tr5.setOnClickListener {
            val i=roll.random()
            check(i,tr5)
            if (i=="1"){
                val intent1=Intent(this@Game,Win::class.java)
                startActivity(intent1)

            }
            else{
                scr--
                if(scr==2){
                    hurt3.setImageResource(R.drawable.noheart)
                }
                else if(scr==1){
                    hurt2.setImageResource(R.drawable.noheart)
                }
                lose(scr)

            }
        }

    }


    fun check(i:String,im: ImageView) {
        if (i == "1") {
            im.setImageResource(R.drawable.gold)
        } else{
            im.setImageResource(R.drawable.tnt)
        }
    }
    fun lose(src:Int){
        if (src==0) {
            val intent = Intent(this@Game, Lose::class.java)
            startActivity(intent)

        }

    }

}