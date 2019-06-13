package com.example.myvkclient.presentation.screen.profile.profileView

import com.arellomobile.mvp.MvpView

interface ProfileView : MvpView {
    fun showName(firstName: String)
    fun showLastName(lastName: String)
    fun showStatus(status: String)
    fun showCity(city: String)
    fun showBirthday(birthday: String)
    fun showPhone(phone: String)

    fun showEmptyFeed()
    fun showProgress()
    fun hideProgress()
    fun showErrorFeed()
}