package br.com.digitalhouse.desafioandroid.fragments

import android.app.Activity
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.com.digitalhouse.desafioandroid.ContractHomeActivity
import br.com.digitalhouse.desafioandroid.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_details.view.*

class DetailsFragment : Fragment() {
    private lateinit var imagem: String
    private lateinit var nome: String
    private lateinit var prato: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState?.let {
            /*imagem = it.getString("imagem").toString()*/
            nome = it.getString("nome").toString()
            prato = it.getString("prato").toString()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_details, container, false)

        /*view.imagem_food2.setBackgroundResource(imagem.toInt())*/
        view.imagem_food2.setBackgroundResource(requireArguments().getInt("imagem"))
        view.nome_food2.text = requireArguments().getString("nome")

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val activity = context as AppCompatActivity

        activity.supportActionBar!!.title = ""
        activity.supportActionBar!!.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(activity, android.R.color.transparent)))
        /*activity.toolbar_label.visibility = INVISIBLE*/
        activity.toolbar_label.visibility = INVISIBLE
    }
}