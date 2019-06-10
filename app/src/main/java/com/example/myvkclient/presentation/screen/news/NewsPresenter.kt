package com.example.myvkclient.presentation.screen.news

import com.arellomobile.mvp.InjectViewState
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.screen.message.MessageView
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class NewsPresenter @Inject constructor(private val router: Router): BasePresenter<NewsView>() {
}