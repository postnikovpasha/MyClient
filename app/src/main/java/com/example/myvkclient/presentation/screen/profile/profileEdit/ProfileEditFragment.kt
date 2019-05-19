package com.example.myvkclient.presentation.screen.profile.profileEdit

import android.text.Editable
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile_edit.*
import javax.inject.Inject


class ProfileEditFragment : BaseFragment(R.layout.fragment_profile_edit), ProfileEditView {

    override fun showProfile(firstName: String) {
        profileEditName.text = Editable.Factory.getInstance().newEditable(firstName)
    }

    override fun showStatus(status: String) {
        profileEditStatus.text = Editable.Factory.getInstance().newEditable(status)
    }

    override fun showCity(city: String) {
        profileEditCity.text = Editable.Factory.getInstance().newEditable(city)
    }

    override fun showBirthday(birthday: String) {
        profileEditBirthday.text = Editable.Factory.getInstance().newEditable(birthday)
    }


    @Inject
    @InjectPresenter
    lateinit var presenter: ProfileEditPresenter

    @ProvidePresenter
    fun providePresenter(): ProfileEditPresenter = presenter

    override fun onResume() {
        super.onResume()
        profileEdit_save.setOnClickListener {
            presenter.save()
        }

        profileEdit_close.setOnClickListener {
            presenter.close()
        }

    }


}