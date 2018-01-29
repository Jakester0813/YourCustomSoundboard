package com.example.jake.yourcustomsoundboard.dagger.module

import android.content.Context
import com.example.jake.yourcustomsoundboard.data.local.CustomSoundBoardPrefsManager
import com.example.jake.yourcustomsoundboard.data.model.SoundManager
import dagger.Module

/**
 * Created by jake on 1/24/2018.
 */
@Module
class DataModule(){

    private var mPrefsManager : CustomSoundBoardPrefsManager? = null
    private var mSoundManager : SoundManager? = null

    internal fun getPrefsManager(context: Context): CustomSoundBoardPrefsManager {
        return mPrefsManager ?: CustomSoundBoardPrefsManager(context)
    }

    internal fun getSoundManager(context: Context): SoundManager{
        return mSoundManager ?: SoundManager(context)
    }

}