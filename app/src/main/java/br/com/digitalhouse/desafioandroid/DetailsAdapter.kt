package br.com.digitalhouse.desafioandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.desafioandroid.domain.Food

class DetailsAdapter(private val listDetails: ArrayList<Food>):
    RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder>() {
    class DetailsViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image_details: ImageView = view.findViewById(R.id.image_details)
        val prato_details: TextView = view.findViewById(R.id.prato_details)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detail_food, parent, false)

        return DetailsViewHolder(view)
    }

    override fun getItemCount(): Int = listDetails.size

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        val details = listDetails[position]

        holder.image_details.setImageResource(details.imagem)
        holder.prato_details.text = details.prato
    }
}