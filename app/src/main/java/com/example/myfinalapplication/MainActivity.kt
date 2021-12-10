package com.example.myfinalapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myfinalapplication.R.id.text
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item->
            var fragment: Fragment? = null
            when (item.itemId){
                R.id.car->{
                    fragment=TextFragment()
                }
                R.id.price->{
                    fragment=PriceFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }

        bottomNavigationView.selectedItemId= text
    }

    fun replaceFragment(fragment: Fragment){

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}