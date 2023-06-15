package com.example.karenappcopy.present.presentDI

import com.example.karenappcopy.present.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainViewKoinModel = module {
    viewModel {
        MainViewModel(
            getUserLoginPasswordUseCase = get(),
            saveUserLoginPasswordUseCase = get()
        )
    }
}