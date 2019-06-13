package com.example.myvkclient.presentation.screen.news

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import com.example.myvkclient.presentation.screen.profile.feed.BaseMessage
import com.example.myvkclient.presentation.screen.profile.feed.FeedAdapter
import kotlinx.android.synthetic.main.fragment_news.*
import kotlinx.android.synthetic.main.fragment_profile.*
import javax.inject.Inject

class NewsFragment: BaseFragment(R.layout.fragment_news, true), NewsView {

    @Inject
    @InjectPresenter
    lateinit var presenter: NewsPresenter

    @ProvidePresenter
    fun providePresenter(): NewsPresenter= presenter

    private val feedAdapter = FeedAdapter { presenter.loadPosts() }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initFeed()
        profileRefreshLayout.setOnRefreshListener(presenter::refreshPosts)
    }

    private fun initFeed() {
        profileViewFeed.isNestedScrollingEnabled = false
        profileViewFeed.layoutManager = LinearLayoutManager(context)
        profileViewFeed.adapter = feedAdapter
    }

    override fun showFeed(items: List<BaseMessage>) {
        feedAdapter.setItems(items)
    }

    override fun showEmptyFeed() {
    }

    override fun showProgress() {
        profileProgressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        profileRefreshLayout.isRefreshing = false
        profileProgressBar.visibility = View.GONE
    }

    override fun showErrorFeed() {

    }
}