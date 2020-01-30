package com.emedinaa.circlerecyclerkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var arrNews = mutableListOf<Noticia>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recycler

        arrNews.add(Noticia(1, "Noticia 1", R.drawable.sample_1, true))
        arrNews.add(Noticia(2, "Noticia 2", R.drawable.sample_2, true))
        arrNews.add(Noticia(3, "Noticia 3", R.drawable.sample_3, true))
        arrNews.add(Noticia(4, "Noticia 4", R.drawable.sample_4, true))
        arrNews.add(Noticia(5, "Noticia 5", R.drawable.sample_5, true))
        arrNews.add(Noticia(6, "Noticia 6", R.drawable.sample_6, true))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        val adapter = NewAdapter(arrNews)
        recyclerView.adapter = adapter
    }
}


