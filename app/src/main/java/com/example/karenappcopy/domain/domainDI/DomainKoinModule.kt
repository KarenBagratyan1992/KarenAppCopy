package com.example.karenappcopy.domain.domainDI

import org.koin.dsl.module

val domainKoinModule = module { includes(getLoginPasswordKoinModel, saveLoginPasswordKoinModel) }