package com.example.memo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerAdapter(val context: Context, private val datalist:ArrayList<DataModel>)
    : RecyclerView.Adapter<RecyclerAdapter.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem=datalist[position]
        Glide.with(holder.itemView)
            .load(currentItem.dataImage) // Replace with the actual image URL or resource
            .into(holder.rvImage)
        holder.rvTitle.text= currentItem.dataText

    }

    class ViewHolderClass(itemView: View):RecyclerView.ViewHolder(itemView) {

        val rvImage: ImageView=itemView.findViewById(R.id.imageView)
        val rvTitle: TextView=itemView.findViewById(R.id.textView)
    }
}
