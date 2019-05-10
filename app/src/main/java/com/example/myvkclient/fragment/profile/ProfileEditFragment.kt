package com.example.myvkclient.fragment.profile

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.myvkclient.R
import com.example.myvkclient.fragment.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile_edit.*
import java.util.jar.Attributes


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


    @InjectPresenter
    lateinit var presenter: ProfileEditPresenter

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