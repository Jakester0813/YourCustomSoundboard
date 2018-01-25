package com.example.jake.yourcustomsoundboard.ui.mainsoundboard

import com.example.jake.yourcustomsoundboard.util.mvp.BasePresenter
import javax.inject.Inject

/**
 * Created by jake on 1/24/2018.
 */
class MainSoundBoardPresenter<V : MainSoundboardActivityContract.View>
@Inject constructor() : BasePresenter<V>(), MainSoundboardActivityContract.Presenter<V> {

}