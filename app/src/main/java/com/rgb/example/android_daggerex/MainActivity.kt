package com.rgb.example.android_daggerex

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mStartPhone : SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerSmartPhoneComponent.create().getSmartPhone().makeACallWithRecording()
        (application as MyApplication).daggerComponent.injectActivity(this)
        Log.i("MyTag", "Actvity after inject")
        mStartPhone.makeACallWithRecording()

    }
}