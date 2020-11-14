package br.com.digitalhouse.desafioandroid

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.desafioandroid.activities.HomeActivity
import br.com.digitalhouse.desafioandroid.domain.Food

class FoodAdapter(
    private val listFoods: ArrayList<Food>,
    private val callDetailsActivity: Intent,
    private val homeActivity: HomeActivity
) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imagem: ImageView = view.findViewById(R.id.imagem_food1)
        val nome: TextView = view.findViewById(R.id.nome_food1)
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

        holder.itemView.setOnClickListener {
            val imagem: Int = food.imagem
            val nome: String? = food.nome
            val prato: String? = food.prato
            /*findNavController(it).navigate(
                R.id.action_homeFragment_to_detailsFragment,
                Bundle().apply {

                })*/
            callDetailsActivity
                .putExtra("imagem", imagem)
                .putExtra("nome", nome)
                .putExtra("prato", prato)
            startActivity(homeActivity, callDetailsActivity, null)
        }
    }
}