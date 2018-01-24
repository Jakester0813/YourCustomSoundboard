package com.example.jake.yourcustomsoundboard.data.local

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by jake on 1/24/2018.
 */
class CustomSoundBoardPrefsManager(context: Context){
    private val mPrefs: SharedPreferences

    init {
        mPrefs = context.getSharedPreferences("CustomSoundBoardPrefs", Context.MODE_PRIVATE);
    }

}