package com.example.myfinalapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PriceViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    private val pricesBayTextView: TextView = itemView.findViewById(R.id.price_bay_text_view)

    fun bind(name: String){
pricesBayTextView.text = name

    }
}