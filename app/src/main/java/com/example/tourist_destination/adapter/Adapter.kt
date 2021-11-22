package com.example.tourist_destination.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tourist_destination.datamodel.Data
import com.example.tourist_destination.DetailActivity
import com.example.tourist_destination.R

class Adapter(val context: Context, val datalist : MutableList<Data>?) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return datalist!!.get(position).type
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val desti_name: TextView = itemView.findViewById(R.id.desti_name)
        val desti_sub: TextView = itemView.findViewById(R.id.desti_sub)
        val photo: ImageView = itemView.findViewById(R.id.photo)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view: View?
    return when (viewType) {
        Data.TOUR -> {
            view =
                LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
//            TextTypeViewHolder(view)
            return ViewHolder(view)

        }
        Data.RES -> {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_recycler_view, parent, false)
//            ImageTypeViewHolder(view)
            return ViewHolder(view)

        }
        Data.HOTEL -> {
            view = LayoutInflater.from(parent.context).inflate(R.layout.simple_item, parent, false)
//            ImageTypeViewHolder(view)
            return ViewHolder(view)

        }
        else -> throw RuntimeException("알 수 없는 뷰 타입 에러")
    }
}

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = datalist!![position]

        holder.desti_name.text = data.title
        holder.desti_sub.text = data.sub
        holder.photo.setImageResource(data.img)

        holder.itemView.tag = position
        holder.itemView.setOnClickListener { v ->
            val desti_name: String = holder.desti_name.getText().toString()
            val desti_sub: String = holder.desti_sub.getText().toString()
            val context = v.context
            val intent: Intent
            intent = Intent(v.context, DetailActivity::class.java)
            intent.putExtra("desti_name", desti_name)
            intent.putExtra("desti_sub", desti_sub)
            intent.putExtra("photo", datalist!![position].img)
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int = datalist!!.size
}
