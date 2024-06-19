package com.example.fibonaccirecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumbersRecycleView (var myNum:List<Int>): RecyclerView.Adapter<NumbHolders>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbHolders {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.nums_list, parent, false)
        return NumbHolders(itemView)

    }

    override fun onBindViewHolder(holder: NumbHolders, position: Int) {

        holder.rvNum.text = myNum[position].toString()

    }

    override fun getItemCount(): Int {
        return myNum.size

    }

}

class NumbHolders(itemView: View): ViewHolder(itemView){
    var rvNum = itemView.findViewById<TextView>(R.id.rvNum)

}

