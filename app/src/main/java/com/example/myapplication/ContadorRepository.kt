package com.example.myapplication

interface ContadorRepository {
    fun ler(): Int
    fun salvar(v: Int)
}