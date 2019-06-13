package com.example.myvkclient.presentation.screen.profile.profileEdit

import android.text.Editable
import android.widget.Toast
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile_edit.*
import javax.inject.Inject


class ProfileEditFragment : BaseFragment(R.layout.fragment_profile_edit, false), ProfileEditView {


    override fun showName(firstName: String) {
        profileViewName.text = Editable.Factory.getInstance().newEditable(firstName)
    }

    override fun showLastName(lastName: String) {
        profileViewLastName.text = Editable.Factory.getInstance().newEditable(lastName)
    }

    override fun showStatus(status: String) {
        profileViewStatus.text = Editable.Factory.getInstance().newEditable(status)
    }

    override fun showCity(city: String) {
        profileViewCity.text = Editable.Factory.getInstance().newEditable(city)
    }

    override fun showBirthday(birthday: String) {
        profileViewBirthday.text = Editable.Factory.getInstance().newEditable(birthday)
    }

    override fun showMessage(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    override fun showPhone(phone: String) {
        profileViewPhone.text = Editable.Factory.getInstance().newEditable(phone)
    }


    @Inject
    @InjectPresenter
    lateinit var presenter: ProfileEditPresenter

    @ProvidePresenter
    fun providePresenter(): ProfileEditPresenter = presenter

    override fun onResume() {
        super.onResume()
        profileEdit_save.setOnClickListener {
            presenter.save(
                profileViewName.text.toString(),
                profileViewLastName.text.toString(),
                profileViewStatus.text.toString(),
                profileViewCity.text.toString(),
                profileViewBirthday.text.toString(),
                profileViewPhone.text.toString()
            )
        }

        profileEdit_close.setOnClickListener {
            presenter.close()
        }

    }


}