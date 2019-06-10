package com.example.myvkclient.presentation.screen.news

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import javax.inject.Inject

class NewsFragment: BaseFragment(R.layout.fragment_news, true), NewsView {

    @Inject
    @InjectPresenter
    lateinit var presenter: NewsPresenter

    @ProvidePresenter
    fun providePresenter(): NewsPresenter= presenter
}