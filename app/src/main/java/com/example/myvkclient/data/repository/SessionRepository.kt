package com.example.myvkclient.data.repository

import com.example.myvkclient.data.converter.Converter
import com.example.myvkclient.data.datasource.AuthDataSource
import com.example.myvkclient.data.datasource.SessionDataSource
import com.example.myvkclient.data.network.Api
import com.example.myvkclient.data.response.ProfileResponse
import com.example.myvkclient.domain.entity.User
import com.example.myvkclient.domain.repository.SessionRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SessionRepositoryImpl @Inject constructor(
    private val authDataSource: AuthDataSource,
    private val sessionDataSource: SessionDataSource,
    private val userConverter: Converter<ProfileResponse, User>
) : SessionRepository {

    override fun login(name: String, password: String): Single<User> = authDataSource
        .login(name, password)
        .subscribeOn(Schedulers.io())
        .map(userConverter::convert)

    override fun isAuth(): Boolean = sessionDataSource.getToken().isNotEmpty()

}