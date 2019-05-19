package com.example.myvkclient.domain.repository

import com.example.myvkclient.presentation.screen.profile.feed.BaseMessage

interface PostRepository {

    fun getAll(): List<BaseMessage>

    fun getPost(id: Long): BaseMessage
}