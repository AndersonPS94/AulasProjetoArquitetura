package com.example.aulaprojetoarquiteturas.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.aulaprojetoarquiteturas.Model.API.UsuarioAPI
import com.example.aulaprojetoarquiteturas.Model.Usuario

class UsuarioViewModel: ViewModel()  {
    private val usuarioAPI = UsuarioAPI()
    val  usuariosLiveData = MutableLiveData<List<Usuario>>()

    fun recuperarUsuarios() {
        val lista = usuarioAPI.recuperarUsuarios()
        usuariosLiveData.value = lista
    }
}