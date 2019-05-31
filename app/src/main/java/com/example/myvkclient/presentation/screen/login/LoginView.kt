package com.example.myvkclient.presentation.screen.login

import com.arellomobile.mvp.MvpView

interface LoginView : MvpView {
    fun shomMessage(message: String)
}