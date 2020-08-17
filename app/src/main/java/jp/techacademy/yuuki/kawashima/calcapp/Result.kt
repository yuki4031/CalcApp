package jp.techacademy.yuuki.kawashima.calcapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val result = intent.getStringExtra("RESULT")
        textView.text = result
    }
}
