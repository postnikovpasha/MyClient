package com.example.myvkclient.dagger

import com.example.myvkclient.data.repository.PostRepositoryImpl
import com.example.myvkclient.data.repository.ProfileRepositoryImpl
import com.example.myvkclient.domain.repository.PostRepository
import com.example.myvkclient.domain.repository.ProfileRepository
import com.example.myvkclient.presentation.screen.profile.profileView.ProfileView
import dagger.Binds
import dagger.Module
import dagger.Reusable

@Module
interface DataModule {

    @Reusable
    @Binds
    fun bindPostRepository(instance: PostRepositoryImpl): PostRepository

    @Reusable
    @Binds
    fun bindProfileRepository(instance: ProfileRepositoryImpl): ProfileRepository

}