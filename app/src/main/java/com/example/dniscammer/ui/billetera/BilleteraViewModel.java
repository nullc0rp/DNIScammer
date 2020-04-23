package com.example.dniscammer.ui.billetera;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BilleteraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BilleteraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}