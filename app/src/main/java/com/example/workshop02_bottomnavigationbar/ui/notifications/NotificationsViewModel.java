package com.example.workshop02_bottomnavigationbar.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Cart Sereen fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}