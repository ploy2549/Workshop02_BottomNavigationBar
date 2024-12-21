package com.example.workshop02_bottomnavigationbar.ui.userprofile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserProfileViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public UserProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is User Profile Sereen fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}