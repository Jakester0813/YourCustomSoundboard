package com.example.jake.yourcustomsoundboard.dagger.component

import android.app.Application
import android.content.Context
import com.example.jake.yourcustomsoundboard.MainSoundboardActivity
import com.example.jake.yourcustomsoundboard.SettingsActivity
import com.example.jake.yourcustomsoundboard.dagger.AppContext
import com.example.jake.yourcustomsoundboard.dagger.module.ActivityModule
import com.example.jake.yourcustomsoundboard.dagger.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by jake on 1/23/2018.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, ActivityModule::class))
interface AppComponent{
    fun inject(activity: MainSoundboardActivity)
    fun inject(activity: SettingsActivity)

    @AppContext
    fun context(): Context
    fun application(): Application
}
