package br.com.digitalhouse.desafioandroid.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import br.com.digitalhouse.desafioandroid.ContractHomeActivity
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.fragments.DetailsFragment
import br.com.digitalhouse.desafioandroid.fragments.HomeFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity()/*, ContractHomeActivity*/ {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //callHomeFragment()
        //toolbar_home.navigationIcon = ResourcesCompat.getDrawable(resources, R.drawable.voltar, null)
        setSupportActionBar(toolbar_home)

        navController = findNavController(R.id.navHostfragment)
        appBarConfiguration = AppBarConfiguration(navController.graph)

        setupActionBarWithNavController(navController, appBarConfiguration)

        supportActionBar!!.title = ""
    }

    /*private fun callHomeFragment() {
        val homeFragment: HomeFragment = HomeFragment.newInstance()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.frameLayout, homeFragment)
            commit()
        }
    }*/

    /*override fun callDetailsFragment(nome: String, prato: String) {
        val detailsFragment = DetailsFragment.newInstance(nome, prato)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_details, detailsFragment)
            commit()
        }
    }*/

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()

    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}