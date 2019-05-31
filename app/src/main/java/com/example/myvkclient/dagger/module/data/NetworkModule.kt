package com.example.myvkclient.dagger.module.data

import com.example.myvkclient.dagger.LiveQualifier
import com.example.myvkclient.dagger.MockQualifier
import com.example.myvkclient.data.network.Api
import com.example.myvkclient.data.network.ApiMock
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber
import javax.inject.Singleton

@Module
abstract class NetworkModule {

    @Module
    companion object {
        @JvmStatic
        @Singleton
        @Provides
        fun provideOkHttp() = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor { Timber.tag("OkHttp").d(it) }.apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()

        @JvmStatic
        @Singleton
        @Provides
        fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl("https://picsum.photos/id/")
            .client(okHttpClient)
            .build()

        @JvmStatic
        @Singleton
        @Provides
        @LiveQualifier
        fun provideApi(retrofit: Retrofit): Api = retrofit.create(Api::class.java)
    }

    @Singleton
    @Binds
    @MockQualifier
    abstract fun bindMockApi(instance: ApiMock): Api

}