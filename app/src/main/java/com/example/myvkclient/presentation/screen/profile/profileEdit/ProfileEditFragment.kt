package com.example.myvkclient.presentation.screen.profile.profileEdit

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile_edit.*
import javax.inject.Inject


class ProfileEditFragment : BaseFragment(R.layout.fragment_profile_edit), ProfileEditView {

    //ЭТИ МЕТОДЫ ПОКА НЕ НУЖНЫ
    override fun showProfile(firstName: String) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showStatus(status: String) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showCity(city: String) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showBirthday(birthday: String) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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