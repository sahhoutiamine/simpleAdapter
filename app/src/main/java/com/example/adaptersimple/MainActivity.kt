package com.example.adaptersimple

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.list)


        val products = listOf(

            mapOf("name" to "Produit 1", "price" to "100h"),
            mapOf("name" to "Produit 2", "price" to "150h"),
            mapOf("name" to "Produit 3", "price" to "200h"),
            mapOf("name" to "Produit 4", "price" to "250h"),

        )



        val adapter = SimpleAdapter(this, products, android.R.layout.simple_list_item_2, arrayOf("name", "price"),

            intArrayOf(android.R.id.text1, android.R.id.text2) )


    }
}