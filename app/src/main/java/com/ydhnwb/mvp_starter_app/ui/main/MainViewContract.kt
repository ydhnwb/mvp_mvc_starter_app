package com.ydhnwb.mvp_starter_app.ui.main


interface MainViewContract {
    interface Listener {
        fun onIncrementClick()
        fun onDecrementClick()
    }

    fun registerListener(listener: Listener)
    fun unregisterListener(listener: Listener)
}