package com.example.myvkclient.presentation.screen.profile.profileEdit

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.myvkclient.App
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.navigation.Screen
import ru.terrakok.cicerone.Router

@InjectViewState
class ProfileEditPresenter(private val router: Router) : BasePresenter<ProfileEditView>() {


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

    }

    // ВОЗМОЖНО СМЕНЮ НЕМНОГО ЛОГИКУ
    fun save() {
        // НЕ РАЗОБРАЛСЯ С КОНТЕКСТОМ + ТУТ БУДУТ ЕЩЕ ДЕЙСТВИЯ И AlertDialog
    }


    fun close() {
        // НЕ РАЗОБРАЛСЯ С КОНТЕКСТОМ + ТУТ БУДУТ ЕЩЕ ДЕЙСТВИЯ И AlertDialog
        router.replaceScreen(Screen.ProfileViewScreen())
    }

}