package com.example.jake.yourcustomsoundboard.ui.mainsoundboard

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.jake.yourcustomsoundboard.data.model.Sound

/**
 * Created by Jake on 1/28/2018.
 */
abstract class SoundboardAdapter internal constructor(presenter: MainSoundBoardPresenter<MainSoundboardActivityContract.View>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    val sounds: ArrayList<Sound>

    init {
        sounds = ArrayList()
    }



    inner class SoundViewHolder constructor(v: View) : RecyclerView.ViewHolder(v){

    }

}