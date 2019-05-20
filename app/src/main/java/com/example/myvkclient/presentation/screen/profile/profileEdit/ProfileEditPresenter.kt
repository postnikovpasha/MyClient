package com.example.myvkclient.presentation.screen.profile.profileEdit

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.myvkclient.App
import com.example.myvkclient.domain.repository.ProfileRepository
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.navigation.Screen
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class ProfileEditPresenter @Inject constructor(
    private val router: Router,
    private val profileRepository: ProfileRepository
)

    : BasePresenter<ProfileEditView>() {


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showName(profileRepository.getName())
        viewState.showStatus(profileRepository.getStatus())
        viewState.showCity(profileRepository.getCity())
        viewState.showBirthday(profileRepository.getBirthday())

    }


    fun save() {
        //TODO("БУДУТ ЕЩЕ ДЕЙСТВИЯ И AlertDialog")
        viewState.showMessage("SAVE")
        router.replaceScreen(Screen.ProfileViewScreen())
    }


    fun close() {
        //TODO("БУДУТ ЕЩЕ ДЕЙСТВИЯ И AlertDialog")
        viewState.showMessage("DONT SAVE")
        router.replaceScreen(Screen.ProfileViewScreen())
    }

}