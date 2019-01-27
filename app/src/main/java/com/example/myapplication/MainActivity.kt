package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView:BottomNavigationView = findViewById(R.id.bottom_nav)
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        fragment()}

    private fun fragment() {
        supportFragmentManager
        .beginTransaction()
        .replace(R.id.fragment_container,Fragment_Home())
        .commit()   }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> { supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Fragment_Home()).commit() }
            R.id.fav -> { supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Fragment_Favorite()).commit() }
            R.id.search -> { supportFragmentManager.beginTransaction().replace(R.id.fragment_container, Fragment_Search()).commit() } }
        true }

}
