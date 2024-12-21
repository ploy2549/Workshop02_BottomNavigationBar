package com.example.workshop02_bottomnavigationbar.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Home Sereen fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}