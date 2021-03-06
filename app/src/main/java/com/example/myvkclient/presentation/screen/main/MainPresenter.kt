package com.example.myvkclient.presentation.screen.main

import com.arellomobile.mvp.InjectViewState
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.navigation.Screen
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainPresenter@Inject constructor(private val router: Router) : BasePresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.newRootScreen(Screen.SplashScreen())
    }

    fun replaceOnProfile() {
        router.replaceScreen(Screen.ProfileViewScreen())
    }

    fun replaceOnMessage() {
        router.replaceScreen(Screen.MessageScreen())
    }

    fun replaseOnNews() {
        router.replaceScreen(Screen.NewsScreen())
    }
}