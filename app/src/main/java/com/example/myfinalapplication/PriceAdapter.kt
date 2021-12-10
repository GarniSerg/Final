package com.example.myfinalapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PriceAdapter(private val pricesBay: List<String>):
    RecyclerView.Adapter<PriceViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PriceViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.price_list_item, parent false)
        return PriceViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PriceViewHolder, position: Int) {
        val name=pricesBay[position]
        holder.bind(name)

    }

    override fun getItemCount(): Int {
        return pricesBay.size
    }
}