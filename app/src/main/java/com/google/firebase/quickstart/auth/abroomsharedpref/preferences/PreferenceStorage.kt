package com.google.firebase.quickstart.auth.abroomsharedpref.preferences

import kotlinx.coroutines.flow.Flow

interface PreferenceStorage {

    //check if user has saved some details to database, move to details screen if saved
    //set allSongs sort order
    fun savedKey() : Flow<Boolean>
    suspend fun setSavedKey(order: Boolean)

}