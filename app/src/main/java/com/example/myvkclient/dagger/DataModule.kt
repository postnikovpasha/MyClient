package com.example.myvkclient.dagger

import com.example.myvkclient.data.repository.PostRepositoryImpl
import com.example.myvkclient.domain.repository.PostRepository
import dagger.Binds
import dagger.Module
import dagger.Reusable

@Module
interface DataModule {

    @Reusable
    @Binds
    fun bindPostRepository(instance: PostRepositoryImpl): PostRepository
}