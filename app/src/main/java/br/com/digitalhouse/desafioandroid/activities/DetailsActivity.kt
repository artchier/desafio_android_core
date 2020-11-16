package br.com.digitalhouse.desafioandroid.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.digitalhouse.desafioandroid.DetailsAdapter
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.domain.Food
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    private lateinit var adapter: DetailsAdapter

    companion object {
        private var x: Int = 0
        private var y: Int = 0

        fun setXY(coordinateX: Int, coordinateY: Int) {
            x = coordinateX
            y = coordinateY
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        toolbar_details.title = ""

        setSupportActionBar(toolbar_details)

        toolbar_details.setNavigationOnClickListener {
            onBackPressed()
        }

        val imagem = intent.getIntExtra("imagem", 0)
        val nome = intent.getStringExtra("nome")
        val prato = intent.getStringExtra("prato")
        adapter = DetailsAdapter(
            arrayListOf(
                Food(
                    imagem,
                    nome,
                    null,
                    null,
                    prato, resources.getString(R.string.texto_louco)
                ),
                Food(
                    imagem,
                    null,
                    null,
                    null,
                    prato, resources.getString(R.string.texto_louco)
                ),
                Food(
                    imagem,
                    null,
                    null,
                    null,
                    prato, resources.getString(R.string.texto_louco)
                ),
                Food(
                    imagem,
                    null,
                    null,
                    null,
                    prato, resources.getString(R.string.texto_louco)
                ),
                Food(
                    imagem,
                    null,
                    null,
                    null,
                    prato, resources.getString(R.string.texto_louco)
                ),
                Food(
                    imagem,
                    null,
                    null,
                    null,
                    prato, resources.getString(R.string.texto_louco)
                )
            ), this
        )
        imagem_food2.setBackgroundResource(imagem)
        nome_food2.text = nome
        recyclerView2.adapter = adapter
    }

    override fun onBackPressed() {
        super.onBackPressed()
        scrollDetails.scrollTo(x, y)
    }
}