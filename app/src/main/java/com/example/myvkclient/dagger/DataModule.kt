package com.example.myvkclient.dagger

import com.example.myvkclient.data.repository.PostRepositoryImpl
import com.example.myvkclient.data.repository.ProfileRepositoryImpl
import com.example.myvkclient.data.repository.SessionRepositoryImpl
import com.example.myvkclient.domain.repository.PostRepository
import com.example.myvkclient.domain.repository.ProfileRepository
import com.example.myvkclient.domain.repository.SessionRepository
import dagger.Binds
import dagger.Module
import dagger.Reusable

@Module(includes = [
    NetworkModule::class,
    ConverterModule::class
])

interface DataModule {

    @Reusable
    @Binds
    fun bindPostRepository(instance: PostRepositoryImpl): PostRepository

    @Reusable
    @Binds
    fun bindProfileRepository(instance: ProfileRepositoryImpl): ProfileRepository

    @Reusable
    @Binds
    fun bindSessionRepository(instance: SessionRepositoryImpl): SessionRepository

}