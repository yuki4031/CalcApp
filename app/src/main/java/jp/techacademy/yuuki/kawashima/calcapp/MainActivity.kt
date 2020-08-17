package jp.techacademy.yuuki.kawashima.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_result.*
import android.util.Log
import android.support.v7.app.AlertDialog
import java.lang.Exception

class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener(this)
        minus.setOnClickListener(this)
        multiply.setOnClickListener(this)
        divide.setOnClickListener(this)
    }

    private fun showAlertDialog() {
        // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("数字を入力してください")
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    override fun onClick(v: View) {
        try {
            val num1: Double = editText1.text.toString().toDouble()
            val num2: Double = editText2.text.toString().toDouble()
            var result: String
            if (v.id == R.id.plus) {
                result = (num1 + num2).toString()
            } else if (v.id == R.id.minus) {
                result = (num1 - num2).toString()
            } else if (v.id == R.id.multiply) {
                result = (num1 * num2).toString()
            } else {
                result = (num1 / num2).toString()
            }
            val intent = Intent(this, Result::class.java)
            intent.putExtra("RESULT", result)
            startActivity(intent)
        }catch (e:Exception){
            showAlertDialog()
        }
    }
}
