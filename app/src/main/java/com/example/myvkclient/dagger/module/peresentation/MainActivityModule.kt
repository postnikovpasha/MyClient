package com.example.myvkclient.dagger.module.peresentation

import com.example.myvkclient.dagger.FragmentScope
import com.example.myvkclient.presentation.screen.login.LoginFragment
import com.example.myvkclient.presentation.screen.profile.profileEdit.ProfileEditFragment
import com.example.myvkclient.presentation.screen.profile.profileView.ProfileViewFragment
import com.example.myvkclient.presentation.screen.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {

    @FragmentScope
    @ContributesAndroidInjector
    fun provideSplashFragment(): SplashFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun provideProfileViewFragment(): ProfileViewFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun provideProfileEditFragment(): ProfileEditFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun provideLoginFragment(): LoginFragment
}