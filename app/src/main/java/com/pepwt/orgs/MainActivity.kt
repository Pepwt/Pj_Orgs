package com.pepwt.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"
        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, uva e manga"
        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.99"
    }
}