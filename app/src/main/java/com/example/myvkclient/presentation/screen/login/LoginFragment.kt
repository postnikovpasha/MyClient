package com.example.myvkclient.presentation.screen.login

import com.example.myvkclient.App
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import com.example.myvkclient.presentation.navigation.Screen

class LoginFragment : BaseFragment(R.layout.fragment_login) {

    override fun onResume() {
        super.onResume()



        login_buttonLogin.setOnClickListener {
            App.INCTANCE.router.replaceScreen(Screen.ProfileViewScreen())
        }
    }


}