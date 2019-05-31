package com.example.myvkclient.presentation.screen.splash

import android.os.Handler
import com.arellomobile.mvp.InjectViewState
import com.example.myvkclient.data.datasource.SessionDataSource
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.navigation.Screen
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class SplashPresenter @Inject constructor(
    private val sessionDataSource: SessionDataSource,
    private val router: Router
) : BasePresenter<SplashView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        Handler().postDelayed({
            if (sessionDataSource.getToken() == "") {
                router.newRootScreen(Screen.LoginScreen())
            }else{
                router.newRootScreen(Screen.ProfileViewScreen())
            }

        }, 2000)
    }
}