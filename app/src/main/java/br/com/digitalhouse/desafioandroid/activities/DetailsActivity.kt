package br.com.digitalhouse.desafioandroid.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.digitalhouse.desafioandroid.DetailsAdapter
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.domain.Food
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity(), Contract {
    private lateinit var adapter: DetailsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        toolbar_details.title = ""
        toolbar_details.setNavigationOnClickListener {
            onBackPressed()
        }

        setSupportActionBar(toolbar_details)

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
            )
        , this)
        imagem_food2.setBackgroundResource(imagem)
        nome_food2.text = nome
        recyclerView2.adapter = adapter
    }
}