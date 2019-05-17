package com.example.myvkclient.presentation.screen.login

import com.arellomobile.mvp.InjectViewState
import com.example.myvkclient.App
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.navigation.Screen
import com.example.myvkclient.presentation.screen.main.MainView
import ru.terrakok.cicerone.Router

@InjectViewState
class LoginPresenter(private val router: Router) : BasePresenter<LoginView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()


    }

    fun login(){
        router.newRootScreen(Screen.ProfileViewScreen())
    }
}