package com.ydhnwb.mvp_starter_app.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.google.android.material.button.MaterialButton
import com.ydhnwb.mvp_starter_app.R

class MainView (inflater: LayoutInflater, parent : ViewGroup?) : MainViewContract{
    private val view : View = inflater.inflate(R.layout.activity_main, parent, false)
    private val numTextView: TextView
    private val incrementButton : MaterialButton
    private val decrementButton : MaterialButton
    private var mListener: MainViewContract.Listener? = null

    init {
        numTextView = getRootView().findViewById(R.id.num_textView)
        incrementButton = getRootView().findViewById(R.id.increment_button)
        decrementButton = getRootView().findViewById(R.id.decrement_button)
        incrementClick()
        decrementClick()
    }

    override fun registerListener(listener: MainViewContract.Listener) {
        mListener = listener
    }

    override fun unregisterListener(listener: MainViewContract.Listener) {
        mListener = null
    }

    fun getRootView() = view

    fun setNumText(num : Int){
        numTextView.text = num.toString()
    }

    private fun incrementClick() {
        incrementButton.setOnClickListener {
            mListener?.onIncrementClick()
        }
    }

    private fun decrementClick(){
        decrementButton.setOnClickListener {
            mListener?.onDecrementClick()
        }
    }

 }