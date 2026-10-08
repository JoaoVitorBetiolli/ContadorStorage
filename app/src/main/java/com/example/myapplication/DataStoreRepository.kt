package com.example.myapplication

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

val Context.dataStore by preferencesDataStore(name = "MyPrefs")

class DataStoreRepository(private val context: Context) : ContadorRepository {

    private val CHAVE = intPreferencesKey("cliques")

    override fun ler(): Int = runBlocking {
        context.dataStore.data.map { it[CHAVE] ?: 0 }.first()
    }

    override fun salvar(v: Int) {
        runBlocking {
            context.dataStore.edit { it[CHAVE] = v }
        }
    }
}