package br.com.digitalhouse.desafioandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.digitalhouse.desafioandroid.R
import kotlinx.android.synthetic.main.fragment_dish.view.*

class DishFragment : Fragment() {
    private var imagem: Int = 0
    private lateinit var prato: String
    private lateinit var descricao: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            imagem = it.getInt("imagem")
            prato = it.getString("prato", null)
            descricao = it.getString("descricao", null)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dish, container, false)

        view.imagem_food3.setBackgroundResource(imagem)
        view.nome_food3.text = prato
        view.descricao.text = descricao

        view.toolbar_dish.setNavigationOnClickListener {

        }

        return view
    }

    companion object {
        fun newInstance(imagem: Int, prato: String, descricao: String) = DishFragment().apply {
            arguments = Bundle().apply {
                putInt("imagem", imagem)
                putString("prato", prato)
                putString("descricao", descricao)
            }
        }
    }
}