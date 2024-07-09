package com.example.yukinews.util

import android.content.SharedPreferences
import javax.inject.Inject

class SessionManager @Inject constructor(private val sp : SharedPreferences) {

    fun getIsFirstRun() = sp.getBoolean(Constants.FIRST_RUN_KEY, true)

    fun setIsFirstRun(value : Boolean){
        val editor = sp.edit().putBoolean(Constants.FIRST_RUN_KEY, value).apply()
    }

}