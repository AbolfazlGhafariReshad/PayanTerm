package com.example.payanterm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class AdapterProduct(private val list: Array<ModelProduct>) : RecyclerView.Adapter<AdapterProduct.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txtname = itemView.findViewById<TextView>(R.id.txtname)
        val txtphone = itemView.findViewById<TextView>(R.id.txtphone)
        val imageView2= itemView.findViewById<ImageView>(R.id.imageView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_phone, parent, false)
        return ViewHolder(view)
    }

    private lateinit var context: Context

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.txtname.text= list[position].name
        holder.txtphone.text= list[position].phone
        Picasso.get().load(list[position].pic).into(holder.imageView2);

    }

    override fun getItemCount(): Int {
        return list.size
    }

}