package com.example.kondo.lesbinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.kondo.lesbinding.BR;

public class Counter extends BaseObservable {
    private String count;

    public Counter() {
        this.count = "";
    }

    @Bindable
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
        notifyPropertyChanged(BR.count);
    }
}
