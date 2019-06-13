package com.example.myvkclient.presentation.screen.news

import com.arellomobile.mvp.MvpView
import com.example.myvkclient.presentation.screen.news.feed.BaseMessage

interface NewsView: MvpView {
    fun showFeed(items: List<BaseMessage>)

    fun showEmptyFeed()
    fun showProgress()
    fun hideProgress()
    fun showErrorFeed()
}