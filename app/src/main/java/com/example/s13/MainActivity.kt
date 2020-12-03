package com.example.s13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_2.btnClick
import kotlinx.android.synthetic.main.activity_3.*
import kotlinx.android.synthetic.main.activity_5.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)
    btnAct501.setOnClickListener {
        tvAct502.visibility = View.INVISIBLE
    }
        btnAct502.setOnClickListener {
            tvAct502.visibility = View.VISIBLE
        }
    }

}