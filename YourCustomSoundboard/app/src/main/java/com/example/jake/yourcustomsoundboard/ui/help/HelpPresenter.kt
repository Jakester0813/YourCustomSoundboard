package com.example.jake.yourcustomsoundboard.ui.help

import com.example.jake.yourcustomsoundboard.util.mvp.BasePresenter
import javax.inject.Inject

/**
 * Created by jake on 1/24/2018.
 */
class HelpPresenter<V : HelpActivityContract.View>
@Inject constructor() : BasePresenter<V>(), HelpActivityContract.Presenter<V> {

}