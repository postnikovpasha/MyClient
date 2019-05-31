package com.example.myvkclient.data.converter

interface Converter<T, K> {

    fun convert(t: T): K
}