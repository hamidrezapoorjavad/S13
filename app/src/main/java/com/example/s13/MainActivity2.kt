package com.example.s13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        imgStar.setOnClickListener{
            val age = editText.text
            Toast.makeText(this,age.toString(),Toast.LENGTH_LONG).show()
        }
    }
}