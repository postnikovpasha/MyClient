package com.example.myvkclient.fragment

import com.example.myvkclient.App
import com.example.myvkclient.R
import com.example.myvkclient.navigation.Screen
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment(R.layout.fragment_login) {

    override fun onResume() {
        super.onResume()



        login_buttonLogin.setOnClickListener {
            App.INCTANCE.router.replaceScreen(Screen.ProfileViewScreen())
        }
    }


}