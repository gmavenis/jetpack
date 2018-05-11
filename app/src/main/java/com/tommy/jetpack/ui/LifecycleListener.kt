package com.tommy.jetpack.ui

import android.content.Context
import android.util.Log
import com.tommy.jetpack.util.BaseConstants

interface LifecycleListener : BaseConstants {

    fun start(context: Context) {
        Log.e(BaseConstants.TAG, context.toString() + " start")
    }

    fun stop(context: Context) {
        Log.e(BaseConstants.TAG, context.toString() + " stop")
    }
}