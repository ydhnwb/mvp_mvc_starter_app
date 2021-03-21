package com.ydhnwb.mvp_starter_app.ui.main

import com.ydhnwb.mvp_starter_app.common.BaseView


interface MainViewContract : BaseView {
    interface Listener {
        fun onIncrementClick()
        fun onDecrementClick()
    }

    fun registerListener(listener: Listener)
    fun unregisterListener(listener: Listener)
}