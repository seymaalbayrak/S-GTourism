package com.example.sgtourism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rv : RecyclerView
    private lateinit var cityList : ArrayList<Cities>
    private lateinit var adapter: CitiesRvAdapter
    private lateinit var suggestion : ImageView
    private lateinit var contact: Button
    private lateinit var about: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contact = findViewById(R.id.button)
        about =findViewById(R.id.button2)
        suggestion = findViewById(R.id.suggestionImageView)
        rv = findViewById(R.id.rv)

        rv.setHasFixedSize(true)

        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val i1 = Cities("İstanbul")
        val i2 = Cities("İzmir")
        val i3 = Cities("Kapadokya")
        val i4 = Cities("Antep")
        val i5 = Cities("Bodrum")
        val i6 = Cities("Trabzon")



        cityList = ArrayList<Cities>()
        cityList.add(i1)
        cityList.add(i2)
        cityList.add(i3)
        cityList.add(i4)
        cityList.add(i5)
        cityList.add(i6)


        adapter = CitiesRvAdapter(this,cityList)

        rv.adapter = adapter

        suggestion.setOnClickListener() {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("cityname", "Kapadokya")
            startActivity(intent)
        }

        contact.setOnClickListener { view ->
            onSeriesButtonClick(view)
        }
        about.setOnClickListener { view ->
            onSeriesButtonClick2(view)
        }
    }

    private fun onSeriesButtonClick(view: View) {



        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("infoname", "contact")
        startActivity(intent)
    }
    private fun onSeriesButtonClick2(view: View) {


        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("infoname", "about")
        startActivity(intent)
    }
}
