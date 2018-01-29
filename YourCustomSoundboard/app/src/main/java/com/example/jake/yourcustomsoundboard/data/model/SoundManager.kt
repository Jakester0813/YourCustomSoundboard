package com.example.jake.yourcustomsoundboard.data.model

import android.content.Context
import android.content.Context.AUDIO_SERVICE
import android.media.AudioManager
import android.media.SoundPool

/**
 * Created by jake on 1/28/2018.
 */
public class SoundManager constructor(context: Context){
    val mSoundPool: SoundPool
    val mAudioManager: AudioManager
    var actVolume: Float
    var maxVolume: Float
    var volume: Float
    var loaded: Boolean = false

    init {
        mSoundPool = SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        mAudioManager = context.getSystemService(AUDIO_SERVICE) as AudioManager
        actVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC) as Float
        maxVolume = mAudioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC) as Float
        volume = actVolume / maxVolume
    }

    fun playSound(id: Int){
        if(loaded)
            mSoundPool.play(id,volume,volume,1,0,1f)
    }

    fun stopSound(id: Int){
        mSoundPool.stop(id);
    }




}