package br.com.digitalhouse.desafioandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.desafioandroid.domain.Food

class FoodAdapter(private val listFoods: ArrayList<Food>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imagem: ImageView = view.findViewById(R.id.imagem_food)
        val nome: TextView = view.findViewById(R.id.nome_food)
        val endereco: TextView = view.findViewById(R.id.endereco_food)
        val horario: TextView = view.findViewById(R.id.horario_food)
    }

    override fun getItemCount(): Int = listFoods.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_food, parent, false)

        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = listFoods[position]

        holder.imagem.setImageResource(food.imagem)
        holder.nome.text = food.nome
        holder.endereco.text = food.endereco
        holder.horario.text = food.horario
    }
}