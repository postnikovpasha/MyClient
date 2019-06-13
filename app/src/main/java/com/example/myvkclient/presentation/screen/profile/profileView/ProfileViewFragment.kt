package com.example.myvkclient.presentation.screen.profile.profileView

import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_news.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.profileViewToolbar
import javax.inject.Inject

class ProfileViewFragment : BaseFragment(R.layout.fragment_profile, true), ProfileView {
    companion object {

        fun createInstance() = ProfileViewFragment()
    }

    @Inject
    @InjectPresenter
    lateinit var presenter: ProfileViewPresenter

    @ProvidePresenter
    fun providePresenter(): ProfileViewPresenter = presenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
    }


    override fun showName(firstName: String) {
        profileViewName.text = firstName
    }

    override fun showLastName(lastName: String) {
        profileViewLastName.text = lastName
    }

    override fun showStatus(status: String) {
        profileViewStatus.text = status
    }

    override fun showCity(city: String) {
        profileViewCity.text = city
    }

    override fun showBirthday(birthday: String) {
        profileViewBirthday.text = birthday
    }

    override fun showPhone(phone: String) {
        profileViewPhone.text = phone
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


    private fun initToolbar() {
        profileViewToolbar.inflateMenu(R.menu.menu_profile_view)
        profileViewToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_profile_edit -> presenter.profileEdit()

                R.id.action_logout -> presenter.logout()
            }

            true
        }
    }
}
