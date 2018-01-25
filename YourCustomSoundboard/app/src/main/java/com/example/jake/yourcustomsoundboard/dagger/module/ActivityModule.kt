package com.example.jake.yourcustomsoundboard.dagger.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.example.jake.yourcustomsoundboard.dagger.ActivityContext
import com.example.jake.yourcustomsoundboard.dagger.PerActivity
import com.example.jake.yourcustomsoundboard.ui.help.HelpActivityContract
import com.example.jake.yourcustomsoundboard.ui.help.HelpPresenter
import com.example.jake.yourcustomsoundboard.ui.mainsoundboard.MainSoundBoardPresenter
import com.example.jake.yourcustomsoundboard.ui.mainsoundboard.MainSoundboardActivityContract
import com.example.jake.yourcustomsoundboard.ui.settings.SettingsActivityContract
import com.example.jake.yourcustomsoundboard.ui.settings.SettingsPresenter
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

    @Provides
    @PerActivity
    internal fun provideMainSoundBoardPresenter(presenter: MainSoundBoardPresenter<MainSoundboardActivityContract.View>) :
            MainSoundboardActivityContract.Presenter<MainSoundboardActivityContract.View> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideSettingsPresenter(presenter: SettingsPresenter<SettingsActivityContract.View>) :
            SettingsActivityContract.Presenter<SettingsActivityContract.View> {
        return presenter
    }

    @Provides
    @PerActivity
    internal fun provideHelpPresenter(presenter: HelpPresenter<HelpActivityContract.View>) :
            HelpActivityContract.Presenter<HelpActivityContract.View> {
        return presenter
    }
}