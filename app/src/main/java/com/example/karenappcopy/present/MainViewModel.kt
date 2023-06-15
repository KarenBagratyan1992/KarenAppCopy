package com.example.karenappcopy.present

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.karenappcopy.domain.ModelDomain.UserDomainModels
import com.example.karenappcopy.domain.useCase.GetUserLoginPasswordUseCase
import com.example.karenappcopy.domain.useCase.SaveUserLoginPasswordUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    val getUserLoginPasswordUseCase: GetUserLoginPasswordUseCase,
    val saveUserLoginPasswordUseCase: SaveUserLoginPasswordUseCase
) : ViewModel() {

    private val _data: MutableLiveData<UserDomainModels> = MutableLiveData()
    val data: LiveData<UserDomainModels> = _data

    fun save(log: String, pass: String) {
        viewModelScope.launch {
            val text = UserDomainModels(login = log, password = pass, id = 1)
            saveUserLoginPasswordUseCase.execute(text)
        }
    }

    fun get() {
        viewModelScope.launch {
            val text = getUserLoginPasswordUseCase.execute()
            _data.postValue(text)
        }
    }
}



