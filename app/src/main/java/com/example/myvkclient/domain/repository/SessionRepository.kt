package com.example.myvkclient.domain.repository

import com.example.myvkclient.domain.entity.User
import io.reactivex.Single

interface SessionRepository {

    fun login(name: String, password: String): Single<User>

    fun isAuth(): Boolean

}