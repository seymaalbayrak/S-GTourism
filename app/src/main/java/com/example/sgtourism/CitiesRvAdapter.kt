package com.example.sgtourism

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CitiesRvAdapter(private val mContext: Context, private val citiesList: List<Cities>) : RecyclerView.Adapter<CitiesRvAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var seriesCardView: CardView
        var cardImage: ImageView
        var cardtext: TextView
        init {
            seriesCardView = view.findViewById(R.id.citiesCardView)
            cardImage = view.findViewById(R.id.cities_card_image)
            cardtext = view.findViewById(R.id.cardtext)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.cities_cardview,parent,false)
        return  CardViewDesignObjectHolder(design)
    }



    override fun getItemCount(): Int {
        return citiesList.size
    }

    override fun onBindViewHolder(
        holder: CitiesRvAdapter.CardViewDesignObjectHolder,
        position: Int
    ) {
        val cities = citiesList[position]
        holder.cardtext.setText(cities.name)
        if (cities.name=="Bodrum") {
            holder.cardImage.setBackgroundResource(R.drawable.bodrum)


        }
        else if (cities.name=="Antep") {
            holder.cardImage.setBackgroundResource(R.drawable.antep)

        }
        if (cities.name.equals("İstanbul")) {
            holder.cardImage.setBackgroundResource(R.drawable.istanbul)

        }
        if (cities.name=="Kapadokya") {
            holder.cardImage.setBackgroundResource(R.drawable.kapadokya)

        }
        if (cities.name=="İzmir") {
            holder.cardImage.setBackgroundResource(R.drawable.izmir)

        }
        if (cities.name=="Trabzon") {
            holder.cardImage.setBackgroundResource(R.drawable.trabzon)
        }
        holder.seriesCardView.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, DetailActivity::class.java)
            intent.putExtra("cityname", cities.name)
            mContext.startActivity(intent)
        })
    }
}