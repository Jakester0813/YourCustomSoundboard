package com.example.jake.yourcustomsoundboard.data.model

/**
 * Created by jake on 1/28/2018.
 */

class Sound internal constructor(pName : String, pFile: String) {
    var name: String
    val fileName: String
    var soundId: Int = 0

    init {
        name = pName
        fileName = pFile
    }

    init {

    }

}
