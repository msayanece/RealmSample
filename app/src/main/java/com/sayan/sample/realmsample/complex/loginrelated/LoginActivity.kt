package com.sayan.sample.realmsample.complex.loginrelated

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.sayan.sample.realmsample.R
import com.sayan.sample.realmsample.complex.loginrelated.viewmodel.LoginRelatedViewModel
import com.sayan.sample.realmsample.complex.showToast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun onClickLogin(view: View){
        val emailID = emailEditText.text.toString()
        val password = passwordEditText.text.toString()
        val loginRelatedViewModel = ViewModelProviders.of(this).get(LoginRelatedViewModel::class.java)
        loginRelatedViewModel.loginWithPassword(emailID, password)
    }
    fun onClickRegister(view: View){

    }
    fun onClickForgotPassword(view: View){

    }
}
