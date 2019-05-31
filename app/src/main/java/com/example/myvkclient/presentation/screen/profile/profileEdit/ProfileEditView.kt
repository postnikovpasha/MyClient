package com.example.myvkclient.presentation.screen.profile.profileEdit

import com.arellomobile.mvp.MvpView

interface ProfileEditView : MvpView {
    fun showName(firstName: String)
    fun showLastName(lastName: String)
    fun showStatus(status: String)
    fun showCity(city: String)
    fun showBirthday(birthday: String)
    fun showPhone(phone: String)

//    fun getName() : String
//    fun getLastName() : String
//    fun getStatus() : String
//    fun getCity() : String
//    fun getBirthday() : String
//    fun getPhone() : String


    fun showMessage(message: String)
}