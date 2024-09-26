package com.example.aulaprojetoarquiteturas.Model.API

import com.example.aulaprojetoarquiteturas.Model.Usuario

class UsuarioAPI {
    fun recuperarUsuarios(): List<Usuario> {
        val listaUsuario = listOf(
            Usuario ("Anderson", 23),
            Usuario ("Pedro", 30),
            Usuario ("Maria", 24),
            Usuario ("Jamilton", 20),
            Usuario ("Joana", 45  )
        )
        return listaUsuario
    }
}