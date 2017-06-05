package com.example.kondo.lesbinding;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.kondo.lesbinding.databinding.ActivityMainBinding;
import com.example.kondo.lesbinding.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mActivityMainBinding;
    private MainViewModel viewModel;
    static private int MAXLENGTH = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mActivityMainBinding.setActivity(this);
        viewModel = new MainViewModel("0/200", 0, MAXLENGTH);
        mActivityMainBinding.setViewmodel(viewModel);
    }

    public void onEditTextChanged(CharSequence s, int start, int before, int count) {
        String body = s.toString();
        int length = body.length();
        viewModel.setCount(length);
        if (length > MAXLENGTH) {
            mActivityMainBinding.submitButton.setEnabled(false);
            mActivityMainBinding.countTextView.setTextColor(Color.RED);
        } else {
            mActivityMainBinding.submitButton.setEnabled(true);
            mActivityMainBinding.countTextView.setTextColor(Color.BLACK);
        }
    }
}
