package com.example.myvkclient

import com.example.myvkclient.presentation.screen.main.MainPresenter
import com.example.myvkclient.presentation.screen.profile.profileEdit.ProfileEditPresenter
import com.example.myvkclient.presentation.screen.profile.profileView.ProfileViewPresenter
import com.example.myvkclient.presentation.screen.splash.SplashPresenter
import org.koin.dsl.module
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

val presentationModule = module {

    single { Cicerone.create() }
    single { get<Cicerone<Router>>().router }
    single { get<Cicerone<Router>>().navigatorHolder }

    factory { SplashPresenter(get()) }
    factory { MainPresenter(get()) }
    factory { ProfileViewPresenter(get()) }
    factory { ProfileEditPresenter(get()) }
}