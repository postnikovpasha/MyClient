package com.example.myvkclient.presentation.screen.profile.profileEdit

import com.arellomobile.mvp.MvpView

interface ProfileEditView : MvpView {
    fun showName(firstName: String)
    fun showStatus(status: String)
    fun showCity(city: String)
    fun showBirthday(birthday: String)
}