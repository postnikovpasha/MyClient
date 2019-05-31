package com.example.myvkclient.dagger.module.peresentation

import com.example.myvkclient.dagger.ActivityScope
import com.example.myvkclient.presentation.screen.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface AppModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun provideMainActivity(): MainActivity
}

