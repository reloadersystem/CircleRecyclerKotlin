package com.emedinaa.circlerecyclerkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class NewAdapter(val news: List<Noticia>) :
    RecyclerView.Adapter<NewAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent?.context)
            .inflate(R.layout.row_noticia, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return news.size
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val noticia = news[position].text
        val image = news[position].image

        holder.imageViewData.setImageResource(news[position].image)

        holder.textViewDescripcion.setText(news[position].text)


    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val textViewDescripcion: TextView = itemView.findViewById(R.id.textView)
        val textViewNum: TextView = itemView.findViewById(R.id.textView2)
        val textViewContenido: TextView = itemView.findViewById(R.id.textView3)
        val imageViewData: CircleImageView = itemView.findViewById(R.id.imageView)
    }
}