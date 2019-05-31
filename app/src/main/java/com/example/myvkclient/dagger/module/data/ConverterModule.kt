package com.example.myvkclient.dagger.module.data

import com.example.myvkclient.data.converter.Converter
import com.example.myvkclient.data.converter.PostsConverter
import com.example.myvkclient.data.converter.UserConverter
import com.example.myvkclient.data.response.PostResponse
import com.example.myvkclient.data.response.ProfileResponse
import com.example.myvkclient.domain.entity.Post
import com.example.myvkclient.domain.entity.User
import dagger.Binds
import dagger.Module
import dagger.Reusable

@Module
interface ConverterModule {

    @Reusable
    @Binds
    fun bindUserConverter(instance: UserConverter): Converter<ProfileResponse, User>

    @Reusable
    @Binds
    fun bindPostsConverter(instance: PostsConverter): Converter<List<PostResponse>, List<Post>>
}