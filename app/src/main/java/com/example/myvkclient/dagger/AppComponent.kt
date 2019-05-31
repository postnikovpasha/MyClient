package com.example.myvkclient.dagger

import com.example.myvkclient.App
import com.example.myvkclient.dagger.module.data.DataModule
import com.example.myvkclient.dagger.module.peresentation.PresentationModule
import dagger.Component
import javax.inject.Singleton
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        PresentationModule::class,
        DataModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Builder : AndroidInjector.Factory<App>
}