package com.sayan.sample.realmsample;

import android.app.Application;

import io.realm.Realm;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Realm (just once per application)
        Realm.init(this);
    }
}
