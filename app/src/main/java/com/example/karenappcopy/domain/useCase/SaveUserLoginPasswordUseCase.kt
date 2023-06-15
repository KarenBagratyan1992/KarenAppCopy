package com.example.karenappcopy.domain.useCase

import com.example.karenappcopy.domain.ModelDomain.UserDomainModels
import com.example.karenappcopy.domain.repository.Repository

class SaveUserLoginPasswordUseCase(val user: Repository) {

    suspend fun execute(model: UserDomainModels) {
        val temp = UserDomainModels(login = model.login, password = model.password, id = 1)
        user.saveUser(temp)

    }
}