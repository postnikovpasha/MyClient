package com.example.myvkclient.data.converter

interface TwoWayConverter<T, K> {

    fun convertTo(t: T): K

    fun convertFrom(k: K): T

}