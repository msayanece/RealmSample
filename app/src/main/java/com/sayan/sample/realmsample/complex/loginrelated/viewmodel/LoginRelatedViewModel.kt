package com.sayan.sample.realmsample.complex.loginrelated.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.sayan.sample.realmsample.complex.loginrelated.repositories.LoginRelatedRepositories
import com.sayan.sample.realmsample.complex.loginrelated.response.LoginResponse

class LoginRelatedViewModel(application: Application): AndroidViewModel(application) {
    private var loginResponseData: MutableLiveData<LoginResponse>? = null
    fun loginWithPassword(emailID: String, password: String) :MutableLiveData<LoginResponse>{
        loginResponseData = MutableLiveData()
        LoginRelatedRepositories().login(getApplication<Application>(), emailID, password)
        return loginResponseData as MutableLiveData<LoginResponse>
    }

}