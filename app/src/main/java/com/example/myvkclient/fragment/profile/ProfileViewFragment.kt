package com.example.myvkclient.fragment.profile

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.myvkclient.R
import com.example.myvkclient.fragment.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileViewFragment : BaseFragment(R.layout.fragment_profile), ProfileView {


    @InjectPresenter
    lateinit var presenter: ProfileViewPresenter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
    }


    override fun showProfile(firstName: String) {
        profileViewName.text = firstName
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