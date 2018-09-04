package com.example.stmak.learnand

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_life_cycle.*

class LifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

        tv_lifecycle.text = "onCreate()"
    }

    override fun onStart() {
        super.onStart()

        tv_lifecycle.text = "onStart()"
    }

}
