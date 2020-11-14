package br.com.digitalhouse.desafioandroid.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.domain.Usuario
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
        register_button1.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }

        /*onBackPressedDispatcher.addCallback(this, object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController(R.layout.activity_login).navigateUp()
            }
        })*/
    }
}