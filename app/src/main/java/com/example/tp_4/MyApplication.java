package com.example.tp_4;

import android.app.Application;

import io.realm.Realm;

public class MyApplication extends Application {
    private Realm realm;

    @Override
    public void onCreate() {
        super.onCreate();
        realm = Realm.getDefaultInstance();
    }
}
