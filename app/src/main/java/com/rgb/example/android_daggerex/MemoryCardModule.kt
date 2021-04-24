package com.rgb.example.android_daggerex

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard() : MemoryCard{
        return MemoryCard()
    }
}