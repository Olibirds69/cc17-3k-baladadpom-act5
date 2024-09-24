package com.example.artspace.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.artspace.R
import com.example.artspace.model.ArtSpace

class ArtSpaceAdapter(private val data: List<ArtSpace>) :
    RecyclerView.Adapter<ArtSpaceAdapter.ArtSpaceItemViewHolder>() {

    class ArtSpaceItemViewHolder(val column: View) : RecyclerView.ViewHolder(column) {
        val artSpaceImg: ImageView = column.findViewById(R.id.img1)
        val artSpaceDesc: TextView = column.findViewById(R.id.img1_Desc)
        val artSpaceAuth: TextView = column.findViewById(R.id.img1_Author)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtSpaceItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.images, parent, false)
        return ArtSpaceItemViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ArtSpaceItemViewHolder, position: Int) {
        holder.artSpaceImg.setImageResource(data[position].imageResId)
        holder.artSpaceDesc.text = data[position].desc
        holder.artSpaceAuth.text = data[position].auth
    }
}
