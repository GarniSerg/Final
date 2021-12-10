package com.example.myfinalapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class PriceFragment : Fragment() {

    lateinit var pricesRecyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_price, container, false)
        val pricesBay:List<String> = listOf("7000$", "8000$", "9000$", "28000$", "70000$")


        pricesRecyclerView = view.findViewById(R.id.price_recycler_view)

        pricesRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        pricesRecyclerView.adapter = PriceAdapter(pricesBay)

        return view
    }


}