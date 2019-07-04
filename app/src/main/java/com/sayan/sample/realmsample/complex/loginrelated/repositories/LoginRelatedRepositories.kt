package com.sayan.sample.realmsample.complex.loginrelated.repositories

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.sayan.sample.realmsample.complex.loginrelated.response.LoginResponse
import com.sayan.sample.realmsample.simple.Dog
import io.realm.Realm

class LoginRelatedRepositories {
    fun login(context: Context, email: String, password: String): MutableLiveData<LoginResponse> {
        val loginLiveData = MutableLiveData<LoginResponse>()
//
//        val realm = Realm.getDefaultInstance()
//// Asynchronously update objects on a background thread
//        realm.executeTransactionAsync(Realm.Transaction { bgRealm ->
//            val dog = bgRealm.where(Dog::class.java).equalTo("age", 1).findFirst()
//            dog!!.setAge(3)
//        }, Realm.Transaction.OnSuccess {
//            // Original queries and Realm objects are automatically updated.
//            puppies.size // => 0 because there are no more puppies younger than 2 years old
//            managedDog.getAge()   // => 3 the dogs age is updated
//        })
        return loginLiveData
    }
}