package com.tommy.jetpack.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.tommy.jetpack.ui.LifecycleListener
import com.tommy.jetpack.util.BaseConstants

open class BaseActivity : LifecycleListener, AppCompatActivity() {

    fun <T> launchActivity(bundle: Bundle?, clazz: Class<T>) {
        val intent = Intent(this@BaseActivity, clazz)
        intent.putExtras(bundle ?: Bundle())
        startActivity(intent);
    }

    fun log(message: String) {
        Log.e(BaseConstants.TAG, message)
    }

    fun toast(message: String) {
        Toast.makeText(this@BaseActivity, message, Toast.LENGTH_SHORT).show()
    }

    fun toast(id: Int) {
        Toast.makeText(this@BaseActivity, id, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        start(this)
    }

    override fun onStop() {
        super.onStop()
        stop(this)
    }
}