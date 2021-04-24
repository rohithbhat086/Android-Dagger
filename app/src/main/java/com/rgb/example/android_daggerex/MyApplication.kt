package com.rgb.example.android_daggerex

import android.app.Application
import android.util.Log

class MyApplication : Application() {
    lateinit var daggerComponent: SmartPhoneComponent
    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    fun initDagger(){
        daggerComponent = DaggerSmartPhoneComponent.create()
        Log.i("MyTag", "Dagger init done")
    }
}