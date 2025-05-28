package com.example.cambiodemoneda.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cambiodemoneda.R

class DolarAdapter(private val dolar: MutableList<Any>):RecyclerView.Adapter<DolarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DolarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return  DolarViewHolder(layoutInflater.inflate(R.layout.money_item,parent , false))
    }

    override fun getItemCount(): Int {
        return dolar.size
    }

    override fun onBindViewHolder(holder: DolarViewHolder, position: Int) {
        val item = dolar[position]
        holder.bind(item)
    }
}