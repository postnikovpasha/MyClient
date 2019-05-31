package com.example.myvkclient.data.datasource

import com.example.myvkclient.dagger.MockQualifier
import com.example.myvkclient.data.network.Api
import com.example.myvkclient.data.response.ProfileResponse
import io.reactivex.Single
import javax.inject.Inject

interface AuthDataSource {

    fun login(name: String, password: String): Single<ProfileResponse>
}

class AuthDataSourceImpl @Inject constructor(@MockQualifier private val api: Api) : AuthDataSource {

    override fun login(name: String, password: String): Single<ProfileResponse> = api.login(name, password)
}