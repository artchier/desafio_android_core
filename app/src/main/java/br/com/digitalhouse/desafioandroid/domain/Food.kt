package br.com.digitalhouse.desafioandroid.domain

import androidx.appcompat.app.AppCompatActivity
import br.com.digitalhouse.desafioandroid.R

class Food(
    val imagem: Int,
    val nome: String?,
    val endereco: String?,
    val horario: String?,
    val prato: String?,
    val descricao: String?
){
    constructor(): this(0, null, null, null, null, null)
    fun getListFoods(activity: AppCompatActivity): ArrayList<Food> {
        return arrayListOf(
            Food(
                R.drawable.image1,
                "Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 00:00",
                "Salada com molho de Gengibre",
                activity.resources.getString(R.string.texto_louco)
            ),
            Food(
                R.drawable.image2,
                "Aoyama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "Fecha às 00:00",
                "Salada com molho de Gengibre",
                activity.resources.getString(R.string.texto_louco)
            ),
            Food(
                R.drawable.image3,
                "Outback - Moema",
                "Av. Moaci, 187, 187 - Moema, São Paulo",
                "Fecha às 00:00",
                "Salada com molho de Gengibre",
                activity.resources.getString(R.string.texto_louco)
            ),
            Food(
                R.drawable.image4,
                "Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "Fecha às 01:00",
                "Salada com molho de Gengibre",
                activity.resources.getString(R.string.texto_louco)
            )
        )
    }
}
