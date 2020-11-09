package br.com.digitalhouse.desafioandroid.activities

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import br.com.digitalhouse.desafioandroid.R
import br.com.digitalhouse.desafioandroid.domain.Usuario
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    private lateinit var callLoginActivity: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        callLoginActivity = Intent(this, LoginActivity::class.java)
        toolbar_register.setTitleTextColor(ContextCompat.getColor(this, R.color.action_bar))
        setSupportActionBar(toolbar_register)
        toolbar_register.setNavigationOnClickListener {
            startActivity(callLoginActivity)
            finish()
        }

        register_button2.setOnClickListener {
            when(comparePassword(nova_senha_confirma.text.toString(), nova_senha.text.toString())){
                true -> {
                    callLoginActivity.putExtra("key", Usuario(nome.text.toString(), novo_email.text.toString(), nova_senha.text.toString()))
                    startActivity(callLoginActivity)
                    finish()
                }
                false -> {
                    when{
                        nome.text.toString() == "" || novo_email.text.toString() == "" ->
                            Snackbar.make(snack_layout, "Preencha os dados de cadastro corretamente", Snackbar.LENGTH_SHORT)
                                .show()
                        else -> Snackbar.make(snack_layout, "Repita a senha corretamente", Snackbar.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        }
    }

    private fun comparePassword(passwordConfirm: String, password: String): Boolean{
        return when{
            passwordConfirm == "" || password == "" -> false
            else -> passwordConfirm == password
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()

        startActivity(callLoginActivity)
        finish()
    }
}