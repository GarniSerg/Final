package com.example.myfinalapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class TextFragment : Fragment() {


    lateinit var textImageView: ImageView
    lateinit var pushButton: Button

    private val textImageList :List<Int> = listOf(
        R.drawable.audi,
        R.drawable.bmw,
        R.drawable.chrysler,
        R.drawable.lamborghini,
        R.drawable.mersedes,


    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_text, container, false)

        textImageView = view.findViewById(R.id.text_image_view)
        pushButton = view.findViewById(R.id.push_button)

        pushButton.setOnClickListener{
            textImageView.setImageResource(textImageList.random())

        }



        return view
    }


}