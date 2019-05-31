package com.example.myvkclient.data.converter

import com.example.myvkclient.data.response.PostResponse
import com.example.myvkclient.domain.entity.Post
import javax.inject.Inject


class PostsConverter @Inject constructor() : Converter<@JvmSuppressWildcards List<@kotlin.jvm.JvmSuppressWildcards PostResponse>, @JvmSuppressWildcards List<@kotlin.jvm.JvmSuppressWildcards Post>> {

    override fun convert(t: List<PostResponse>): List<Post> = t.map {
        Post(it.id)
    }
}