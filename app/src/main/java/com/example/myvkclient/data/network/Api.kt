package com.example.myvkclient.data.network

import com.example.myvkclient.data.response.PostResponse
import com.example.myvkclient.data.response.ProfileResponse
import io.reactivex.Single
import retrofit2.http.*

interface Api {

    @FormUrlEncoded
    @POST("login")
    fun login(@Field("name") name: String, @Field("password") password: String): Single<ProfileResponse>

    @GET("posts/page/{page}")
    fun getPosts(@Path("page") page: Int): Single<List<PostResponse>>

}