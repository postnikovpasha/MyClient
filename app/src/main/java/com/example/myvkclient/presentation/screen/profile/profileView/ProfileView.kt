package com.example.myvkclient.presentation.screen.profile.profileView

import com.arellomobile.mvp.MvpView

interface ProfileView : MvpView {
    fun showProfile(firstName: String)
    fun showStatus(status: String)
    fun showCity(city: String)
    fun showBirthday(birthday: String)
}