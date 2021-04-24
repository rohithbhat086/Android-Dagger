package com.rgb.example.android_daggerex

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {
   fun getSmartPhone() : SmartPhone
   fun injectActivity(activity: MainActivity)
}