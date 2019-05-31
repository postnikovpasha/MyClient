package com.example.myvkclient.domain.repository

interface ProfileRepository {

    fun getName(): String
    fun getLastName(): String
    fun getStatus(): String
    fun getCity(): String
    fun getBirthday(): String
    fun getPhone(): String
}