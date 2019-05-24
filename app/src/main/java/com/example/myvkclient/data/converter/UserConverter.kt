package com.example.myvkclient.data.converter

import com.example.myvkclient.data.response.ProfileResponse
import com.example.myvkclient.domain.entity.User
import javax.inject.Inject

class UserConverter @Inject constructor() : Converter<ProfileResponse, User> {

    override fun convertTo(t: ProfileResponse): User = User(
        t.id,
        t.firstName,
        t.lastName
    )

    override fun convertFrom(k: User): ProfileResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}