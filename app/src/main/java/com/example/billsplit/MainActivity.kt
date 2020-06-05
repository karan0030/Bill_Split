package com.example.billsplit

import android.graphics.Color
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val v1:Int =amount.text.toString().toInt()
       // val v2:Int=no_of_people.text.toString().toInt()
        var a:String =amount.text.toString()
        var p = no_of_people.text.toString()



        button_split.setOnClickListener()
            {

                   // text_result.setText("passed null").toString()



                        var x=amount.text.toString().toInt()
                        var y=no_of_people.text.toString().toInt()
                        var z:Int=x/y
//                Toast.makeText(this ,z.toString(), Toast.LENGTH_SHORT)
//                    .show()

                      text_result.setText(z.toString()).toString()



            }

        button_theme.setOnClickListener()
        {
            var a=(1..3)
            val rnds = (0..3).random()
            when(rnds){
                0->   screen!!.setBackgroundColor(Color.GREEN)
                1->    screen!!.setBackgroundColor(Color.LTGRAY)
                2->  screen!!.setBackgroundColor(Color.YELLOW)
                3->  screen!!.setBackgroundColor(Color.CYAN)
            }

        }

    }
}