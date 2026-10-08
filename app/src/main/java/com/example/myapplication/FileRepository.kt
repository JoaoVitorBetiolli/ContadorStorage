package com.example.myapplication

import android.content.Context
import java.io.File

class FileRepository(private val context: Context) : ContadorRepository {

    private val arquivo = File(context.filesDir, "contador.txt")

    override fun ler(): Int =
        if (arquivo.exists()) arquivo.readText().trim().toIntOrNull() ?: 0
        else 0

    override fun salvar(v: Int) {
        arquivo.writeText(v.toString())
    }
}