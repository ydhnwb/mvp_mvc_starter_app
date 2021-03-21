package com.ydhnwb.mvp_starter_app.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.ydhnwb.mvp_starter_app.R
import com.ydhnwb.mvp_starter_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainViewContract.Listener{
    private lateinit var mainView: MainView
    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainView = MainView(layoutInflater, null)
        mainView.registerListener(this)
        setContentView(mainView.getRootView())
        setSupportActionBar(mainView.getRootView().findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onIncrementClick() {
        num++
        mainView.setNumText(num)
    }

    override fun onDecrementClick() {
        num--
        mainView.setNumText(num)
    }
}