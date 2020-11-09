package br.com.digitalhouse.desafioandroid.domain

import java.io.Serializable

data class Usuario(val nome: String, var email: String, var senha: String): Serializable {
}