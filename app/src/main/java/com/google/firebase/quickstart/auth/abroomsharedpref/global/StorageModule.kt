package com.google.firebase.quickstart.auth.abroomsharedpref.global

import com.google.firebase.quickstart.auth.abroomsharedpref.preferences.PreferenceImpl
import com.google.firebase.quickstart.auth.abroomsharedpref.preferences.PreferenceStorage
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class StorageModule {

    @Binds
    abstract fun bindsPreferenceStorage(preferenceStorageImpl: PreferenceImpl): PreferenceStorage

}