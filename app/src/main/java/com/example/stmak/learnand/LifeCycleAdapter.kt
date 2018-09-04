package com.example.stmak.learnand

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class LifeCycleAdapter(private val itemList: ArrayList<String>) : RecyclerView.Adapter<LifeCycleAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: LifeCycleAdapter.ViewHolder, position: Int) {
        holder.txt.text = itemList[position]
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LifeCycleAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_adapter_lifecycle, parent, false)
        return ViewHolder(v)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txt = itemView.findViewById<TextView>(R.id.item_lifecycle)!!
    }


}