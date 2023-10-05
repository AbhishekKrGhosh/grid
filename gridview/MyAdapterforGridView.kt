package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapterforGridView(var c: Context, var list:ArrayList<GridModel>):
    RecyclerView.Adapter<MyAdapterforGridView.MyHolder>()
{
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name:TextView
        var image:ImageView
        init{
            name=itemView.findViewById(R.id.textView2)
            image=itemView.findViewById(R.id.imageView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view:View=LayoutInflater.from(c)
            .inflate(R.layout.grid,parent,false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.name.text=list[position].name
        holder.image.setImageResource(list[position].image)
    }
}