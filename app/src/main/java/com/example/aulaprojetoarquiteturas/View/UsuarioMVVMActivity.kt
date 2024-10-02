package com.example.aulaprojetoarquiteturas.View

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.aulaprojetoarquiteturas.R
import com.example.aulaprojetoarquiteturas.databinding.ActivityUsuarioMvvmactivityBinding
import com.example.aulaprojetoarquiteturas.viewmodel.UsuarioViewModel

class UsuarioMVVMActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityUsuarioMvvmactivityBinding.inflate(layoutInflater)
    }

    private lateinit var usuarioViewModel: UsuarioViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        usuarioViewModel = ViewModelProvider(this)[UsuarioViewModel::class.java]
        usuarioViewModel.usuariosLiveData.observe(this) { lista ->
            var resultafoLista = ""
            lista.forEach {
                resultafoLista += "${it.nome} - ${it.idade}\n"
            }
            binding.textLista.text = resultafoLista
        }

        binding.btnCarregar.setOnClickListener {
            usuarioViewModel.recuperarUsuarios()
        }
    }
}