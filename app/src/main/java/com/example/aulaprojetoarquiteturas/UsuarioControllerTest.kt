package com.example.aulaprojetoarquiteturas

import com.example.aulaprojetoarquiteturas.Controller.UsuarioController
import com.example.aulaprojetoarquiteturas.Model.Usuario
import com.example.aulaprojetoarquiteturas.Presenter.IUsuario
import com.example.aulaprojetoarquiteturas.Presenter.UsuarioPresenter

class UsuarioControllerTest {

    inner class  SimularActivity: IUsuario {
        override fun exibirUsuarios(lista: List<Usuario>) {
            println(lista)
        }
    }

    fun testarRecuperarUsuarios() {
        // simular testes
        val simularActivity = SimularActivity()
         val usuarioPresenter = UsuarioPresenter(simularActivity)
        usuarioPresenter.recuperarUsuarios()

    }
}