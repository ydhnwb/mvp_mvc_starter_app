package com.ydhnwb.mvp_starter_app.ui.main

import com.ydhnwb.mvp_starter_app.common.BaseView


interface MainViewContract : BaseView {
    interface Listener {
        fun onIncrementClick()
        fun onDecrementClick()
    }

    fun bindProductToRecyclerView(products: List<String>)
    fun registerListener(listener: Listener)
    fun unregisterListener(listener: Listener)
}