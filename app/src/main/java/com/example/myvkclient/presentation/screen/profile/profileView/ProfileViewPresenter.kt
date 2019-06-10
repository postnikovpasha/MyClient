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

    private val paginator = Paginator(
        {
            postRepository.getPosts(it)
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally { viewState.hideProgress() }
        },
        object : Paginator.ViewController<Post> {

            override fun showEmptyProgress(show: Boolean) {
                viewState.showProgress()
            }

            override fun showEmptyError(show: Boolean, error: Throwable?) {
                viewState.showErrorFeed()
            }

            override fun showEmptyView(show: Boolean) {
                viewState.showEmptyFeed()
            }

            override fun showData(show: Boolean, data: List<Post>) {
                viewState.showFeed(data.map {
                    PostMessage(
                        it.id,
                        "Number ${it.id}",
                        "https://picsum.photos/id/${it.id}/200/300"
                    )
                })
            }

            override fun showErrorMessage(error: Throwable) {

            }

            override fun showRefreshProgress(show: Boolean) {
                viewState.showProgress()
            }

            override fun showPageProgress(show: Boolean) {

            }

        }
    )

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showName(profileRepository.getName())
        viewState.showLastName(profileRepository.getLastName())
        viewState.showStatus(profileRepository.getStatus())
        viewState.showCity(profileRepository.getCity())
        viewState.showBirthday(profileRepository.getBirthday())
        viewState.showPhone(profileRepository.getPhone())
        paginator.refresh()

        //viewState.showFeed(postRepository.getAll())

    }

    fun loadPosts() {
        paginator.loadNewPage()
    }

    fun refreshPosts() {
        paginator.refresh()
    }

    fun logout() {
        sessionDataSource.clearToken()
        router.newRootScreen(Screen.LoginScreen())
    }

    override fun onDestroy() {
        super.onDestroy()
        paginator.release()
    }

    fun profileEdit() {
        router.newRootScreen(Screen.ProfileEditScreen())
    }

}