package jp.techacademy.yuuki.kawashima.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_result.*

class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener(this)
        minus.setOnClickListener(this)
        multiply.setOnClickListener(this)
        divide.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var num1 = editText1.toString().toDouble()
        var num2 = editText2.toString().toDouble()
        var result:String
        if(v.id == R.id.plus){
            result = (num1 + num2).toString()
        }else if(v.id == R.id.minus){
            result = (num1 - num2).toString()
        }else if(v.id == R.id.multiply){
            result = (num1 * num2).toString()
        }else{
            result = (num1 / num2).toString()
        }
        val intent = Intent(this,Result::class.java)
        intent.putExtra("RESULT",result)
        startActivity(intent)
    }
}
