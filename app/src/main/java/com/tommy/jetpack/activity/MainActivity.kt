package com.tommy.jetpack.activity

import android.os.Bundle
import android.view.View
import com.tommy.jetpack.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToLifecycle(view: View?) = this.launchActivity(null, LifecycleActivity::class.java)
}
