package com.example.stmak.learnand

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_life_cycle.*
import java.text.SimpleDateFormat
import java.util.*

class LifeCycleActivity : AppCompatActivity() {
    private val itemList = ArrayList<ItemLifeCycle>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

        updItemList("onCreate()")
    }

    override fun onStart() {
        super.onStart()

        updItemList("onStart()")
    }

    override fun onResume() {
        super.onResume()

        updItemList("onResume()")
    }

    private fun updItemList(txt: String){
        val df = SimpleDateFormat("HH:mm:ss")
        val date = df.format(Calendar.getInstance().time)

        itemList.add(ItemLifeCycle(txt, date))
        recycler_view_lifecycle.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recycler_view_lifecycle.adapter = LifeCycleAdapter(itemList)
    }

}
