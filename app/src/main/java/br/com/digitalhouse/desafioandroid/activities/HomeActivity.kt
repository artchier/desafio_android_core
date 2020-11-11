package br.com.digitalhouse.desafioandroid.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.digitalhouse.desafioandroid.FoodAdapter
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.domain.Food
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private lateinit var adapter: FoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        adapter = FoodAdapter(getListFoods())
        recyclerView.adapter = adapter
    }

    private fun getListFoods(): ArrayList<Food> {
        return arrayListOf(
            Food(
                R.drawable.image1,
                "Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 00:00"
            ),
            Food(
                R.drawable.image2,
                "Aoyama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "Fecha às 00:00"
            ),
            Food(
                R.drawable.image3,
                "Outback - Moema",
                "Av. Moaci, 187, 187 - Moema, São Paulo",
                "Fecha às 00:00"
            ),
            Food(
                R.drawable.image4,
                "Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "Fecha às 01:00"
            )
        )
    }

    override fun onBackPressed() {
        super.onBackPressed()

        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}