package com.example.jake.yourcustomsoundboard.ui.mainsoundboard

import com.example.jake.yourcustomsoundboard.data.local.CustomSoundBoardPrefsManager
import com.example.jake.yourcustomsoundboard.data.model.SoundManager
import com.example.jake.yourcustomsoundboard.util.mvp.BasePresenter
import javax.inject.Inject

/**
 * Created by jake on 1/24/2018.
 */
class MainSoundBoardPresenter<V : MainSoundboardActivityContract.View>
@Inject constructor(internal var mSoundManager: SoundManager,
                    internal var mPrefs: CustomSoundBoardPrefsManager) : BasePresenter<V>(), MainSoundboardActivityContract.Presenter<V> {



    override fun playSound(id: Int) {
       mSoundManager.playSound(id)
    }


}