package com.example.planetcafe_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CoffeePlacesAdapter(
    private val context: Context,
    private val coffee_places: ArrayList<Coffee>) :
    RecyclerView.Adapter<CoffeePlacesAdapter.InstituteViewHolder>() {

    inner class InstituteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.title)
        private val infoTextView: TextView = itemView.findViewById(R.id.subTitle)
        private val coffeeImage: ImageView = itemView.findViewById(R.id.coffeePostImageDetail)

        fun bind(currentCoffee: Coffee) {
            titleTextView.text = currentCoffee.title
            infoTextView.text = currentCoffee.info
            Glide.with(context).load(currentCoffee.imageResource)
                .into(coffeeImage)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): InstituteViewHolder =  InstituteViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.rv_item,
            parent, false
        )
    )

    override fun onBindViewHolder(holder: InstituteViewHolder, position: Int) {
        val currentInstitute = coffee_places[position]
        holder.bind(currentInstitute)
    }

    override fun getItemCount() = coffee_places.size
}