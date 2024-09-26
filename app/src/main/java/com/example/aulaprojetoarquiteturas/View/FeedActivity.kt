package com.example.aulaprojetoarquiteturas.View

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aulaprojetoarquiteturas.Controller.UsuarioController
import com.example.aulaprojetoarquiteturas.Model.Usuario
import com.example.aulaprojetoarquiteturas.Presenter.IUsuario
import com.example.aulaprojetoarquiteturas.Presenter.UsuarioPresenter
import com.example.aulaprojetoarquiteturas.R
import com.example.aulaprojetoarquiteturas.databinding.ActivityFeedBinding
import kotlin.math.log10

class FeedActivity : AppCompatActivity(), IUsuario {

    private val binding by lazy {
        ActivityFeedBinding.inflate(layoutInflater)
    }

    private lateinit var usuarioPresenter: UsuarioPresenter

    val view = binding.root


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view)


        usuarioPresenter = UsuarioPresenter(this)
    }
        override fun onStart() {
            super.onStart()

            usuarioPresenter.recuperarUsuarios()
        }


    override fun exibirUsuarios(Lista: List<Usuario>) {
        var textoUsuario = ""
        Lista.forEach {
            textoUsuario += "${it.nome} - ${it.idade} \n"
        }
        Log.i("exibir_presenter", "exibirUsuarios: $textoUsuario ")
    }
}
