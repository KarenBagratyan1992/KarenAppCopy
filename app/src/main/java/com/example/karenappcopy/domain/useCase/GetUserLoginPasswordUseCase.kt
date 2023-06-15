package com.example.karenappcopy.domain.useCase

import com.example.karenappcopy.domain.ModelDomain.UserDomainModels
import com.example.karenappcopy.domain.repository.Repository

class GetUserLoginPasswordUseCase(val model: Repository) {
    suspend fun execute(): UserDomainModels {
        val temp = model.getUser()
        return temp

    }
}