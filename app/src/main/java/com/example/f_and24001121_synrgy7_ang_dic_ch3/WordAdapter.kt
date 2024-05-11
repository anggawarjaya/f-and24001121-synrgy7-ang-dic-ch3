package com.example.f_and24001121_synrgy7_ang_dic_ch3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(private val listWord: ArrayList<Word>) : RecyclerView.Adapter<WordAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val word = itemView.findViewById<TextView>(R.id.tvWord)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.word_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.word.text = listWord[position].word
    }

    override fun getItemCount(): Int {
        return listWord.size
    }
}