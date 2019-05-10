package com.example.myvkclient.fragment.profile

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.myvkclient.App
import com.example.myvkclient.navigation.Screen

@InjectViewState
class ProfileViewPresenter : MvpPresenter<ProfileView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showProfile("Pavel Postnikov")
        viewState.showStatus("I'm is OK")
        viewState.showCity("Tomsk")
        viewState.showBirthday("1 July")

    }

    fun logout() {
        App.INCTANCE.router.replaceScreen(Screen.LoginScreen())
    }

    fun profileEdit() {
        App.INCTANCE.router.replaceScreen(Screen.ProfileEditScreen())
    }

}