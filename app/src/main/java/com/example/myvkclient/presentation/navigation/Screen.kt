package com.example.myvkclient.presentation.navigation

import androidx.fragment.app.Fragment
import com.example.myvkclient.presentation.screen.login.LoginFragment
import com.example.myvkclient.presentation.screen.message.MessageFragment
import com.example.myvkclient.presentation.screen.news.NewsFragment
import com.example.myvkclient.presentation.screen.profile.profileEdit.ProfileEditFragment
import com.example.myvkclient.presentation.screen.profile.profileView.ProfileViewFragment
import com.example.myvkclient.presentation.screen.splash.SplashFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

sealed class Screen(fragment: Fragment) : BaseScreen(fragment) {
    class LoginScreen : Screen(LoginFragment())
    class SplashScreen : Screen(SplashFragment())
    class ProfileViewScreen : Screen(ProfileViewFragment.createInstance())
    class ProfileEditScreen : Screen(ProfileEditFragment())
    class MessageScreen : Screen(MessageFragment())
    class NewsScreen : Screen(NewsFragment())
}

open class BaseScreen(private val fragment: Fragment) : SupportAppScreen() {
    override fun getFragment(): Fragment = fragment
}