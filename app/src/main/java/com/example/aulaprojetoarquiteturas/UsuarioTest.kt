package com.example.aulaprojetoarquiteturas

import com.example.aulaprojetoarquiteturas.Model.Usuario
import com.example.aulaprojetoarquiteturas.Presenter.IUsuario
import com.example.aulaprojetoarquiteturas.Presenter.UsuarioPresenter
import com.example.aulaprojetoarquiteturas.viewmodel.UsuarioViewModel

class UsuarioTest {

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

        //Simular teste com MVVM
        val usuarioViewModel = UsuarioViewModel()
        usuarioViewModel.recuperarUsuarios()

    }
}