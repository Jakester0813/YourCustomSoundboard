package com.example.jake.yourcustomsoundboard.dagger.module

import android.app.Application
import android.content.Context
import com.example.jake.yourcustomsoundboard.data.local.CustomSoundBoardPrefsManager
import dagger.Module

/**
 * Created by jake on 1/24/2018.
 */
@Module
class AppModule(internal var mApplication: Application){

    private var mPrefsManager : CustomSoundBoardPrefsManager? = null

    internal fun getPrefsManager(context: Context): CustomSoundBoardPrefsManager {
        return mPrefsManager ?: CustomSoundBoardPrefsManager(context)
    }


}