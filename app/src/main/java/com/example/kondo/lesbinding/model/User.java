package com.example.kondo.lesbinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.kondo.lesbinding.BR;

public class User extends BaseObservable {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getAge() {
        return age;
    }
}
