package br.com.digitalhouse.desafioandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.digitalhouse.desafioandroid.R
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.fragment_dish.view.*

class DishFragment : Fragment() {
    private var imagem: Int = 0
    private lateinit var prato: String
    private lateinit var descricao: String
    private var x: Int = 0
    private var y: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            imagem = it.getInt("imagem")
            prato = it.getString("prato", null)
            descricao = it.getString("descricao", null)
            x = it.getInt("x")
            y = it.getInt("y")
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

        view.toolbar_dish.setNavigationIcon(R.drawable.voltar)
        view.toolbar_dish.setNavigationOnClickListener {
            requireActivity().scrollDetails.scrollTo(x, y)
            requireActivity().supportFragmentManager.popBackStackImmediate()
        }
        return view
    }

    companion object {
        fun newInstance(imagem: Int, prato: String, descricao: String, x: Int, y: Int) = DishFragment().apply {
            arguments = Bundle().apply {
                putInt("imagem", imagem)
                putString("prato", prato)
                putString("descricao", descricao)
                putInt("x", x)
                putInt("y", y)
            }
        }
    }
}