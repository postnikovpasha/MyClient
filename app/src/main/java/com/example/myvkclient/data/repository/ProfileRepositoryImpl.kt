package com.example.myvkclient.data.repository

import com.example.myvkclient.domain.repository.ProfileRepository
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor() : ProfileRepository{

    override fun getName(): String = "Postnikov Pasha"

    override fun getStatus(): String = "CFT - the best company!"

    override fun getCity(): String = "Tomsk"

    override fun getBirthday(): String = "1 July 1997"

}