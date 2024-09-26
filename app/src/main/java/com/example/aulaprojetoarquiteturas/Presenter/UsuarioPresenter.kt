package com.example.aulaprojetoarquiteturas.Presenter

import com.example.aulaprojetoarquiteturas.Model.API.UsuarioAPI
import com.example.aulaprojetoarquiteturas.View.MainActivity

class UsuarioPresenter (
    //private val mainActivity =  MainActivity()
    private val iUsuario: IUsuario

) {

    // Injecao de dependencias
    private val usuarioAPI = UsuarioAPI()


    fun recuperarUsuarios() {

        //1) regra de negocio
        val lista = usuarioAPI.recuperarUsuarios()

        //2) Exibir os dados de negocio na tela
        iUsuario.exibirUsuarios(lista)

    }
}