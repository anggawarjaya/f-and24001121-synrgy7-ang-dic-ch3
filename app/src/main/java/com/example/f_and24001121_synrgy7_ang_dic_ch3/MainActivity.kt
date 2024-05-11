package com.example.f_and24001121_synrgy7_ang_dic_ch3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listWord = arrayListOf(
            Word("A"),
            Word("B"),
            Word("C"),
            Word("D"),
            Word("E"),
            Word("F"),
            Word("G"),
            Word("H"),
            Word("I"),
            Word("J"),
            Word("K"),
            Word("L"),
            Word("M"),
            Word("A"),
            Word("A"),
            Word("A"),
            Word("A"),
            Word("A"),
            Word("A"),
            Word("A"),
            Word("A"),
            Word("A"),
            Word("X"),
            Word("Z"),
        )

        val adapter = WordAdapter(listWord)

        val LayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LayoutManager

        recyclerView.adapter = adapter
    }
}