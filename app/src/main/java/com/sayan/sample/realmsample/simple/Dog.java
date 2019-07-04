package com.sayan.sample.realmsample.simple;

import io.realm.RealmObject;

// Define your model class by extending RealmObject
public class Dog extends RealmObject {
    private String name;
    private int age;

    // ... Generated getters and setters ...
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
