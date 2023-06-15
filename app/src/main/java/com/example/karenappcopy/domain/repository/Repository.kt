package com.example.karenappcopy.domain.repository

import com.example.karenappcopy.domain.ModelDomain.UserDomainModels

interface Repository {
    suspend fun getUser(): UserDomainModels
    suspend fun saveUser(user: UserDomainModels)
}