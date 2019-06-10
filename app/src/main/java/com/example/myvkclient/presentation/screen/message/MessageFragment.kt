package com.example.myvkclient.presentation.screen.message

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import javax.inject.Inject

class MessageFragment: BaseFragment(R.layout.fragment_message, true), MessageView {

    @Inject
    @InjectPresenter
    lateinit var presenter: MessagePresenter

    @ProvidePresenter
    fun providePresenter(): MessagePresenter = presenter
}