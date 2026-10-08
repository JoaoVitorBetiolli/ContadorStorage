package com.example.myapplication

import android.content.Context

class MySharedPrefsRepository(context: Context) : ContadorRepository {

    private val prefs =
        context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

    override fun ler(): Int = prefs.getInt("cliques", 0)

    override fun salvar(v: Int) {
        prefs.edit().putInt("cliques", v).apply()
    }
}