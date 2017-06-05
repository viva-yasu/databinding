package com.example.kondo.lesbinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

import java.util.Locale;

/**
 * Created by kondo on 6/6/17.
 */

public class MainViewModel extends BaseObservable {
    private String dispCount;
    private String format = "%d/%d";
    private int MAX_LENGTH;
    private int count;

    public MainViewModel(String dispCount, int count, int maxLength) {
        this.dispCount = dispCount;
        this.count = count;
        this.MAX_LENGTH = maxLength;
    }

    @Bindable
    public String getDispCount() {
        return dispCount;
    }

    public void setDispCount() {
        String displayCount = String.format(Locale.US, format, count, MAX_LENGTH);
        this.dispCount = displayCount;
        notifyPropertyChanged(BR.dispCount);
    }

    @Bindable
    public int getCount() {
        return count;
    }

    @Bindable
    public void setCount(int count) {
        this.count = count;
        setDispCount();
    }
}
