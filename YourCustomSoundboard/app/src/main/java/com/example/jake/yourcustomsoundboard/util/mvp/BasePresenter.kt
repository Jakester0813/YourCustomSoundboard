package com.example.jake.yourcustomsoundboard.util.mvp

import android.content.Context
import android.view.View
import javax.inject.Inject

/**
 * Created by jake on 1/22/2018.
 */

open class BasePresenter<V : IBaseView<*>> @Inject
constructor() : MvpPresenter<V> {

    var mView: V? = null
        private set
    var mContext: Context? = null

    val isViewAttached: Boolean
        get() = mView != null

    override fun onAttach(mvpView: V) {
        mView = mvpView
    }

    override fun onDetach() {
        mView = null
    }

    fun setContext(context: Context){
        mContext = context
    }


}
