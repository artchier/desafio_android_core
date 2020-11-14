package br.com.digitalhouse.desafioandroid.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.domain.Usuario
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    private lateinit var callLoginActivity: Intent
    private lateinit var callHomeActivity: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        callLoginActivity = Intent(this, LoginActivity::class.java)
        callHomeActivity = Intent(this, HomeActivity::class.java)
        toolbar_register.setTitleTextColor(ContextCompat.getColor(this, R.color.action_bar))
        setSupportActionBar(toolbar_register)
        toolbar_register.setNavigationOnClickListener {
            startActivity(callLoginActivity)
            finish()
        }

        register_button2.setOnClickListener {
            startActivity(callHomeActivity)
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        //startActivity(callLoginActivity)
        finish()
    }
}