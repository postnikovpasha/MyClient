package com.example.myvkclient.presentation.screen.profile.profileView

import com.arellomobile.mvp.MvpView
import com.example.myvkclient.presentation.screen.profile.feed.BaseMessage

interface ProfileView : MvpView {
    fun showName(firstName: String)
    fun showStatus(status: String)
    fun showCity(city: String)
    fun showBirthday(birthday: String)

    fun showFeed(items: List<BaseMessage>)
}