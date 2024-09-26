package com.example.aulaprojetoarquiteturas.Controller

import com.example.aulaprojetoarquiteturas.Model.API.UsuarioAPI
import com.example.aulaprojetoarquiteturas.View.MainActivity

class UsuarioController(
    private val mainActivity: MainActivity
) {

    private val usuarioAPI = UsuarioAPI()

    init {
        //recuperarUsuario()
    }

    fun recuperarUsuarios() {

        //1) regra de negocio
        val lista = usuarioAPI.recuperarUsuarios()

        //2) Exibir os dados de negocio na tela
        mainActivity.exibirUsuarios  (lista)

    }
}