package com.example.jake.yourcustomsoundboard.util.mvp

/**
 * Created by jake on 1/22/2018.
 */

interface MvpPresenter<V : IBaseView<*>> {
    fun onAttach(mvpView : V);

    fun onDetach();
}
