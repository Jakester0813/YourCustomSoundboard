package com.example.jake.yourcustomsoundboard.ui.mainsoundboard

import com.example.jake.yourcustomsoundboard.util.mvp.IBaseView
import com.example.jake.yourcustomsoundboard.util.mvp.MvpPresenter

/**
 * Created by jake on 1/24/2018.
 */
interface MainSoundboardActivityContract {


    interface View : IBaseView<Any> {

    }

    interface Presenter<V : IBaseView<*>> : MvpPresenter<V>{

    }


}