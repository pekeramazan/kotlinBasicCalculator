package com.ramazanpeker.kotlinbasiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

var input1 : Int?=null
    var input2 : Int? = null
    var resultValue :Int? =null
//test
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View)
    {
        input1= number1.text.toString().toIntOrNull()
        input2= number2.text.toString().toIntOrNull()
        if(input1==null || input2==null)
        {
            result.text="Error!"
        }
        else
        {
            resultValue=input1!!+input2!!
            result.text= "Result : $resultValue"
        }


    }
    fun sub(view: View)
    {
        input1= number1.text.toString().toIntOrNull()
        input2= number2.text.toString().toIntOrNull()
        if(input1==null || input2==null)
        {
            result.text="Error!"
        }
        else
        {
            resultValue=input1!!-input2!!
            result.text= "Result : $resultValue"
        }

    }
    fun multiply(view: View)
    {
        input1= number1.text.toString().toIntOrNull()
        input2= number2.text.toString().toIntOrNull()
        if(input1==null || input2==null)
        {
            result.text="Error!"
        }
        else
        {
            resultValue=input1!!*input2!!
            result.text= "Result : $resultValue"
        }

    }
    fun dive(view: View)
    {
        input1= number1.text.toString().toIntOrNull()
        input2= number2.text.toString().toIntOrNull()
        if(input1==null || input2==null)
        {
            result.text="Error!"
        }
        else
        {
            resultValue=input1!!/input2!!
            result.text= "Result : $resultValue"
        }

    }

}
