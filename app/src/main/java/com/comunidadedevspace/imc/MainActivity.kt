package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variável e associar(=) o componente de UI.

        val peso = findViewById<TextInputEditText>(R.id.edtpeso)
        val altura = findViewById<TextInputEditText>(R.id.edtaltura)
        val botão = findViewById<TextInputEditText>(R.id.btn_calcular)

        botão.setOnClickListener {
            val spacepeso = peso.text
            val spaceatura = altura.text



        }

    }
}