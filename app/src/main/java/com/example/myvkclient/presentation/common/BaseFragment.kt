package com.example.myvkclient.presentation.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.arellomobile.mvp.MvpAppCompatFragment

abstract class BaseFragment(@LayoutRes private val layoutId: Int) : MvpAppCompatFragment() {

    fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(layoutId, container, false)

}