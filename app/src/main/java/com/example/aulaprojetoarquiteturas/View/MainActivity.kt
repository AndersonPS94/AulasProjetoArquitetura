package com.example.aulaprojetoarquiteturas.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aulaprojetoarquiteturas.Controller.UsuarioController
import com.example.aulaprojetoarquiteturas.Model.Usuario
import com.example.aulaprojetoarquiteturas.Presenter.IUsuario
import com.example.aulaprojetoarquiteturas.Presenter.UsuarioPresenter
import com.example.aulaprojetoarquiteturas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), IUsuario  {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    //private lateinit var usuarioController : UsuarioController
    private var usuarioPresenter  : UsuarioPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*usuarioController = UsuarioController(
            this
        )
        //usuarioController.recuperarUsuario()
        binding.btnRecuperar.setOnClickListener {
            usuarioController.recuperarUsuarios ()
        }*/

         usuarioPresenter = UsuarioPresenter(this)
        binding.btnRecuperar.setOnClickListener {
            usuarioPresenter?.recuperarUsuarios()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        usuarioPresenter = null   
    }
    override fun  exibirUsuarios(Lista: List<Usuario>) {
        //Exibir os dados na tela
        var textoUsuario = ""
        Lista.forEach {
            textoUsuario += "${it.nome} - ${it.idade} \n"
        }
        binding.textResultado.text = textoUsuario

    }
}
