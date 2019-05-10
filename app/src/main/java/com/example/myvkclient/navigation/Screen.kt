package com.example.myvkclient.navigation

import androidx.fragment.app.Fragment
import com.example.myvkclient.fragment.LoginFragment
import com.example.myvkclient.fragment.profile.ProfileEditFragment
import com.example.myvkclient.fragment.profile.ProfileViewFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

sealed class Screen(fragment: Fragment) : BaseScreen(fragment) {
    class LoginScreen : Screen(LoginFragment())
    class ProfileViewScreen : Screen(ProfileViewFragment())
    class ProfileEditScreen : Screen(ProfileEditFragment())
}

open class BaseScreen(private val fragment: Fragment) : SupportAppScreen() {
    override fun getFragment(): Fragment = fragment
}