package com.example.jake.yourcustomsoundboard.ui.settings

import com.example.jake.yourcustomsoundboard.util.mvp.BasePresenter
import javax.inject.Inject

/**
 * Created by jake on 1/24/2018.
 */
class SettingsPresenter<V : SettingsActivityContract.View>
@Inject constructor() : BasePresenter<V>(), SettingsActivityContract.Presenter<V> {

}