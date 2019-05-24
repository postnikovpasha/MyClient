package com.example.myvkclient.data.repository

import com.example.myvkclient.data.converter.Converter
import com.example.myvkclient.data.network.Api
import com.example.myvkclient.data.response.ProfileResponse
import com.example.myvkclient.domain.entity.User
import com.example.myvkclient.domain.repository.SessionRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SessionRepositoryImpl @Inject constructor(
    private val api: Api,
    private val userConverter: Converter<ProfileResponse, User>
) : SessionRepository {

    override fun login(name: String, password: String): Single<User> = api.login(name, password)
        .subscribeOn(Schedulers.io())
        .map(userConverter::convertTo)

    override fun isAuth(): Boolean = true

}