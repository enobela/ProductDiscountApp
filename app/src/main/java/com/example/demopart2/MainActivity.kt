package com.example.demopart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    // Variables
    lateinit var  editText: EditText
    lateinit var  ebutton :Button
    lateinit var  etextView:TextView
    lateinit var  clearbutton:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText= findViewById(R.id.editTextName)
        ebutton= findViewById(R.id.buttonShow)
        etextView= findViewById(R.id.textShow)
        clearbutton=findViewById(R.id.buttonClear)

          val ageLimit= 18 // You have to be 18 to go watch movies.

        // onclick button
        ebutton.setOnClickListener {

            val getName= editText.text.toString()

            if(getName.isNotEmpty())

            {
                val value = getName.toInt()



                val res = GetDiscount(value);  // calling the method GetDiscount and assign the results to res

                etextView.text="You will receive $res"

            }

            else
            {
                Toast.makeText(this,"Please type something on the textfield", Toast.LENGTH_SHORT).show()

            }


           // etextView.setText(getName)

           // Toast.makeText(this,getName, Toast.LENGTH_SHORT).show()


        }




        // Onclick button to clear the edittext and textview

        clearbutton.setOnClickListener {

            editText.text.clear()
            etextView.text=""

        }

    }

 private fun  GetDiscount(productItem: Int) : String
 {
   return   when(productItem){

       100 -> "30% Discount"
       50  -> "25% Discount"
       else -> "0% Discount"

   }

 }

}