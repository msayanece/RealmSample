package com.sayan.sample.realmsample.complex

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sayan.sample.realmsample.R
import com.sayan.sample.realmsample.complex.loginrelated.LoginActivity

class ComplexActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complex)
        startActivity(Intent(this, LoginActivity::class.java))
    }
}