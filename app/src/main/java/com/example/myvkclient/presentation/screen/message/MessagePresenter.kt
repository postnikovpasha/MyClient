package com.example.myvkclient.presentation.screen.message

import com.arellomobile.mvp.InjectViewState
import com.example.myvkclient.presentation.common.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MessagePresenter @Inject constructor(private val router: Router): BasePresenter<MessageView>() {

}