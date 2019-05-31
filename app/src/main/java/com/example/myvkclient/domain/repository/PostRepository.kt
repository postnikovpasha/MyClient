package com.example.myvkclient.domain.repository

import com.example.myvkclient.domain.entity.Post
import com.example.myvkclient.presentation.screen.profile.feed.BaseMessage
import io.reactivex.Single

interface PostRepository {

    fun getPosts(page: Int): Single<List<Post>>

    fun getPost(id: Long): Post

    //fun getAll(): List<BaseMessage>
}