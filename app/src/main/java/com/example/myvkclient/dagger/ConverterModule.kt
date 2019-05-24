package com.example.myvkclient.dagger

import com.example.myvkclient.data.converter.Converter
import com.example.myvkclient.data.converter.UserConverter
import com.example.myvkclient.data.response.ProfileResponse
import com.example.myvkclient.domain.entity.User
import dagger.Binds
import dagger.Module
import dagger.Reusable

@Module
interface ConverterModule {

    @Reusable
    @Binds
    fun bindUserConverter(instance: UserConverter): Converter<ProfileResponse, User>
}