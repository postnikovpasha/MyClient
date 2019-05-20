package com.example.myvkclient.presentation.screen.profile.profileView

import com.arellomobile.mvp.InjectViewState
import com.example.myvkclient.domain.repository.PostRepository
import com.example.myvkclient.domain.repository.ProfileRepository
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.navigation.Screen
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class ProfileViewPresenter @Inject constructor(
    private val router: Router,
    private val postRepository: PostRepository,
    private val profileRepository: ProfileRepository
) : BasePresenter<ProfileView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showName(profileRepository.getName())
        viewState.showStatus(profileRepository.getStatus())
        viewState.showCity(profileRepository.getCity())
        viewState.showBirthday(profileRepository.getBirthday())

        viewState.showFeed(postRepository.getAll())

    }

    fun logout() {
        router.newRootScreen(Screen.LoginScreen())
    }

    fun profileEdit() {
        router.newRootScreen(Screen.ProfileEditScreen())
    }

}