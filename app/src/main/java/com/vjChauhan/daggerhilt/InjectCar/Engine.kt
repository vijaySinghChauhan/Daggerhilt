package com.vjChauhan.daggerhilt.InjectCar

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()

    fun getEngine()
    {
        Log.d("main","Engine started")
    }
}