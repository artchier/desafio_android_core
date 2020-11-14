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

        toolbar_home.title = ""
        setSupportActionBar(toolbar_home)
        val listFodds: ArrayList<Food> = Food().getListFoods(this)
        val callDetailsActivity = Intent(this, DetailsActivity::class.java)
        adapter = FoodAdapter(listFodds, callDetailsActivity, this)
        recyclerView.adapter = adapter
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}