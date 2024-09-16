package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text


const val KEY_RESULT = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)


            val result = intent.getFloatExtra(KEY_RESULT,0f)
            print(result)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassif = findViewById<TextView>(R.id.tv_classificação)

        tvResult.text = result.toString()

        var classificacao: String? = null

        if(result <= 18.5f) {
            classificacao = "MAGREZA"
        } else if(result > 18.5f && result <= 24.9f){
            classificacao = "NORMAL"
        } else if(result > 25.0f && result <= 29.9f){
            classificacao = "SOBREPESO"
        } else if(result > 30.0f && result <= 39.9f){
            classificacao = "OBSEDIDADE"
        } else if(result > 40.0f){
            classificacao = "OBESIDADE GRAVE"
        }

        tvClassif.text = classificacao



        }
    }
