package com.example.myvkclient.data.datasource

import android.content.SharedPreferences
import javax.inject.Inject

interface SessionDataSource {

    fun saveToken(token: String)

    fun clearToken()

    fun getToken(): String
}

class SessionDataSourceImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : SessionDataSource {

    private companion object {
        const val KEY_TOKEN = "authToken"
    }

    override fun saveToken(token: String) = sharedPreferences.edit()
        .putString(KEY_TOKEN, token)
        .apply()

    override fun clearToken() = sharedPreferences.edit()
        .remove(KEY_TOKEN)
        .apply()

    override fun getToken(): String = sharedPreferences.getString(KEY_TOKEN, "").orEmpty()
}