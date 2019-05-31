package com.example.myvkclient.dagger.module.data

import android.content.Context
import android.content.SharedPreferences
import com.example.myvkclient.App
import com.example.myvkclient.data.datasource.AuthDataSource
import com.example.myvkclient.data.datasource.AuthDataSourceImpl
import com.example.myvkclient.data.datasource.SessionDataSource
import com.example.myvkclient.data.datasource.SessionDataSourceImpl
import com.example.myvkclient.data.repository.PostRepositoryImpl
import com.example.myvkclient.data.repository.ProfileRepositoryImpl
import com.example.myvkclient.data.repository.SessionRepositoryImpl
import com.example.myvkclient.domain.repository.PostRepository
import com.example.myvkclient.domain.repository.ProfileRepository
import com.example.myvkclient.domain.repository.SessionRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module(
    includes = [
        NetworkModule::class,
        ConverterModule::class
    ]
)
abstract class DataModule {

    @Module
    companion object {

        @JvmStatic
        @Reusable
        @Provides
        fun provideSharedPreferences(app: App): SharedPreferences =
            app.getSharedPreferences("CommonSharedPreferences", Context.MODE_PRIVATE)
    }

    @Reusable
    @Binds
    abstract fun bindAuthDataSource(instance: AuthDataSourceImpl): AuthDataSource

    @Reusable
    @Binds
    abstract fun bindSessionRepository(instance: SessionRepositoryImpl): SessionRepository

    @Reusable
    @Binds
    abstract fun bindSessionDataSource(instance: SessionDataSourceImpl): SessionDataSource

    @Reusable
    @Binds
    abstract fun bindPostRepository(instance: PostRepositoryImpl): PostRepository

    @Reusable
    @Binds
    abstract fun bindProfileRepository(instance: ProfileRepositoryImpl): ProfileRepository
}