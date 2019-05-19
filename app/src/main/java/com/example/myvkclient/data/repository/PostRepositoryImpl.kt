package com.example.myvkclient.data.repository

import com.example.myvkclient.domain.repository.PostRepository
import com.example.myvkclient.presentation.screen.profile.feed.BaseMessage
import com.example.myvkclient.presentation.screen.profile.feed.PostMessage
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor() : PostRepository {

    override fun getAll(): List<BaseMessage> = (1..100).map {
            PostMessage(
                it,
                "Message".repeat(30),
                "https://picsum.photos/id/$it/200/300"
            )

    }

    override fun getPost(id: Long): BaseMessage {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}