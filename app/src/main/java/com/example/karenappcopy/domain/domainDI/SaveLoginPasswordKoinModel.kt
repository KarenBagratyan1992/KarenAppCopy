package com.example.karenappcopy.domain.domainDI

import com.example.karenappcopy.domain.useCase.SaveUserLoginPasswordUseCase
import org.koin.dsl.module

val saveLoginPasswordKoinModel = module { factory { SaveUserLoginPasswordUseCase(user = get()) } }