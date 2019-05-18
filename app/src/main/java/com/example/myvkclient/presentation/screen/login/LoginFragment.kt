package com.example.myvkclient.presentation.screen.login

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.App
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import com.example.myvkclient.presentation.screen.profile.profileEdit.ProfileEditPresenter
import kotlinx.android.synthetic.main.fragment_login.*
import org.koin.android.ext.android.get


class LoginFragment : BaseFragment(R.layout.fragment_login), LoginView {


    @InjectPresenter
    lateinit var presenter: LoginPresenter

    @ProvidePresenter
    fun providePresenter(): LoginPresenter = get()


    override fun onResume() {
        super.onResume()

        login_buttonLogin.setOnClickListener {
            presenter.login()
        }
    }

}