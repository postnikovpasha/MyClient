package com.example.myvkclient.data.network

import com.example.myvkclient.data.response.ProfileResponse
import io.reactivex.Single
import retrofit2.http.POST

interface Api {
    @POST("login")
    fun login(name: String, password: String): Single<ProfileResponse>
}