package com.example.myvkclient.presentation.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.example.myvkclient.presentation.moxy.MvpAppCompatFragment
import dagger.android.support.AndroidSupportInjection

abstract class BaseFragment(@LayoutRes private val layoutId: Int, private val hasBottomNavigation: Boolean = true) : MvpAppCompatFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(layoutId, container, false)

    override fun onResume() {
        super.onResume()

        if (hasBottomNavigation) {
            (activity as? BottomNavigationController)?.showNavigation()
        } else {
            (activity as? BottomNavigationController)?.hideNavigation()
        }
    }

}