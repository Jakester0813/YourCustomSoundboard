package com.example.jake.yourcustomsoundboard.dagger.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.example.jake.yourcustomsoundboard.dagger.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Created by jake on 1/24/2018.
 */

@Module
class ActivityModule(private val mCompatActivity: AppCompatActivity) {

    @Provides
    @ActivityContext
    internal fun provideContext(): Context {
        return mCompatActivity
    }

    @Provides
    internal fun provideActivity(): AppCompatActivity {
        return mCompatActivity
    }

    //Provides presenters here
}