package com.example.myvkclient.presentation.screen.login

import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.myvkclient.App
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : BaseFragment(R.layout.fragment_login), LoginView {


    @InjectPresenter
    lateinit var presenter: LoginPresenter

    override fun onResume() {
        super.onResume()

        login_buttonLogin.setOnClickListener {
            presenter.login()
        }
    }

}