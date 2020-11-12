package br.com.digitalhouse.desafioandroid.fragments

import android.app.Activity
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.com.digitalhouse.desafioandroid.FoodAdapter
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.domain.Food
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
    private var adapter: FoodAdapter = FoodAdapter(getListFoods())
    private lateinit var activity: AppCompatActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        view.recyclerView.adapter = adapter

        activity.supportActionBar!!.title = ""
        activity.supportActionBar!!.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(activity, R.color.action_bar)))
        activity.toolbar_label.visibility = VISIBLE
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as AppCompatActivity
    }

    private fun getListFoods(): ArrayList<Food> {
        return arrayListOf(
            Food(
                R.drawable.image1,
                "Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 00:00", "Salada com molho de Gengibre"
            ),
            Food(
                R.drawable.image2,
                "Aoyama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "Fecha às 00:00", "Salada com molho de Gengibre"
            ),
            Food(
                R.drawable.image3,
                "Outback - Moema",
                "Av. Moaci, 187, 187 - Moema, São Paulo",
                "Fecha às 00:00", "Salada com molho de Gengibre"
            ),
            Food(
                R.drawable.image4,
                "Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "Fecha às 01:00", "Salada com molho de Gengibre"
            )
        )
    }
}