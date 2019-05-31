package com.example.myvkclient.data.repository

import android.content.SharedPreferences
import com.example.myvkclient.domain.repository.ProfileRepository
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(private val sharedPreferences: SharedPreferences) : ProfileRepository {

    override fun getName(): String = sharedPreferences.getString("Name", "Pasha").orEmpty()

    override fun getLastName(): String = sharedPreferences.getString("LastName", "Postnikov").orEmpty()

    override fun getStatus(): String = sharedPreferences.getString("Status", "I'm OK").orEmpty()

    override fun getCity(): String = sharedPreferences.getString("City", "Tomsk").orEmpty()

    override fun getBirthday(): String = sharedPreferences.getString("Birthday", "01.07.1997").orEmpty()

    override fun getPhone(): String = sharedPreferences.getString("Phone", "89138821258").orEmpty()

}