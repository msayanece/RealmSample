package com.sayan.sample.realmsample.complex

import android.content.Context
import android.widget.Toast

fun Context.showToast(text: String){
    Toast.makeText(this, "test", Toast.LENGTH_LONG).show()
}