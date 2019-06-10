package com.example.myvkclient.presentation.screen.login

import android.widget.Toast
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import javax.inject.Inject
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment(R.layout.fragment_login, false), LoginView {


    @Inject
    @InjectPresenter
    lateinit var presenter: LoginPresenter

    @ProvidePresenter
    fun providePresenter(): LoginPresenter = presenter


    override fun onResume() {
        super.onResume()

        login_buttonLogin.setOnClickListener {
            presenter.login(login_etLogin.text.toString(), login_etPassword.text.toString())
        }
    }

    override fun shomMessage(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

}