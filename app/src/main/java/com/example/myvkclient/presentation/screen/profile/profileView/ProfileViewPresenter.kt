package com.example.myvkclient.presentation.screen.profile.profileView

import com.arellomobile.mvp.InjectViewState
import com.example.myvkclient.data.datasource.SessionDataSource
import com.example.myvkclient.domain.entity.Post
import com.example.myvkclient.domain.repository.PostRepository
import com.example.myvkclient.domain.repository.ProfileRepository
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.common.Paginator
import com.example.myvkclient.presentation.navigation.Screen
import com.example.myvkclient.presentation.screen.profile.feed.PostMessage
import io.reactivex.android.schedulers.AndroidSchedulers
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class ProfileViewPresenter @Inject constructor(
    private val router: Router,
    private val postRepository: PostRepository,
    private val sessionDataSource: SessionDataSource,
    private val profileRepository: ProfileRepository
) : BasePresenter<ProfileView>() {


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showName(profileRepository.getName())
        viewState.showLastName(profileRepository.getLastName())
        viewState.showStatus(profileRepository.getStatus())
        viewState.showCity(profileRepository.getCity())
        viewState.showBirthday(profileRepository.getBirthday())
        viewState.showPhone(profileRepository.getPhone())
    }


    fun profileEdit() {
        router.replaceScreen(Screen.ProfileEditScreen())
    }

    fun logout() {
        sessionDataSource.clearToken()
        router.newRootScreen(Screen.LoginScreen())
    }

}