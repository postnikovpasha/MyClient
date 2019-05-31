package com.example.myvkclient.dagger.module.peresentation

import dagger.Module

@Module(includes = [
    AppModule::class,
    MainActivityModule::class,
    NavigationModule::class
])
interface PresentationModule