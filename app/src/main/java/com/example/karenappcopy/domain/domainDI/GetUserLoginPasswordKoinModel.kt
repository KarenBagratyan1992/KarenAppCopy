package com.example.karenappcopy.domain.domainDI

import com.example.karenappcopy.domain.useCase.GetUserLoginPasswordUseCase
import org.koin.dsl.module

val getLoginPasswordKoinModel = module { factory { GetUserLoginPasswordUseCase(model = get() )} }