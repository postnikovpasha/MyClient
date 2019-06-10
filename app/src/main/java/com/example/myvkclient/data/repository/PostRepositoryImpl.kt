package com.example.myvkclient.data.repository

import com.example.myvkclient.dagger.MockQualifier
import com.example.myvkclient.data.converter.Converter
import com.example.myvkclient.data.network.Api
import com.example.myvkclient.data.response.PostResponse
import com.example.myvkclient.domain.entity.Post
import com.example.myvkclient.domain.repository.PostRepository
import com.example.myvkclient.presentation.screen.profile.feed.BaseMessage
import com.example.myvkclient.presentation.screen.profile.feed.PostMessage
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

//class PostRepositoryImpl @Inject constructor() : PostRepository {
//
//    override fun getAll(): List<BaseMessage> = (1..100).map {
//            PostMessage(
//                it,
//                "Message".repeat(30),
//                "https://picsum.photos/id/$it/200/300"
//            )
//
//    }
//
//}

class PostRepositoryImpl @Inject constructor(
    @MockQualifier private val api: Api,
    private val postsConverter: Converter<List<PostResponse>, List<Post>>
) : PostRepository {

    override fun getPosts(page: Int): Single<List<Post>> =
        api.getPosts(page)
        .subscribeOn(Schedulers.io())
        .map(postsConverter::convert)

        override fun getAll(): List<BaseMessage> = (1..100).map {
            PostMessage(
                it.toLong(),
                "Message".repeat(30),
                "https://picsum.photos/id/$it/200/300"
            )

    }

    override fun getPost(id: Long): Post {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}