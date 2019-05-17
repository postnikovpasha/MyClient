package com.example.myvkclient.presentation.screen.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myvkclient.App
import com.example.myvkclient.R
import com.example.myvkclient.presentation.navigation.Navigator
import com.example.myvkclient.presentation.navigation.Screen
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class MainActivity : AppCompatActivity() {

    private lateinit var navigator: SupportAppNavigator


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator = Navigator(this, supportFragmentManager, R.id.content)
        App.INCTANCE.router.newRootScreen(Screen.LoginScreen())
    }

    override fun onResume() {
        super.onResume()
        App.INCTANCE.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        App.INCTANCE.navigatorHolder.removeNavigator()
    }
}
