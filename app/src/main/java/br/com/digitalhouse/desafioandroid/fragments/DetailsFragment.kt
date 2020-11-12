package br.com.digitalhouse.desafioandroid.fragments

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.com.digitalhouse.desafioandroid.DetailsAdapter
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.domain.Food
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_details.view.*

class DetailsFragment : Fragment() {
    private lateinit var adapter: DetailsAdapter
    private lateinit var activity: AppCompatActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_details, container, false)
        val prato = requireArguments().getString("prato")
        adapter = DetailsAdapter(arrayListOf(
            Food(
                R.drawable.image2,
                null,
                null,
                null,
                prato),
            Food(
                R.drawable.image2,
                null,
                null,
                null,
                prato),
            Food(
                R.drawable.image2,
                null,
                null,
                null,
                prato),
            Food(
                R.drawable.image2,
                null,
                null,
                null,
                prato),
            Food(
                R.drawable.image2,
                null,
                null,
                null,
                prato),
            Food(
                R.drawable.image2,
                null,
                null,
                null,
                prato)))
        view.imagem_food2.setBackgroundResource(requireArguments().getInt("imagem"))
        view.nome_food2.text = requireArguments().getString("nome")
        view.recyclerView2.adapter = adapter

        activity.supportActionBar!!.title = ""
        activity.supportActionBar!!.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(activity, android.R.color.transparent)))
        activity.toolbar_label.visibility = INVISIBLE
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as AppCompatActivity
    }
}