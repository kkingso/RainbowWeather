package com.rainbowweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @date 2020/11/24
 * @author kkw
 * @desc 全局获取Context
 */
class RainbowWeatherApplication : Application() {

    @SuppressLint("StaticFieldLeak")
    companion object {
        const val TOKEN = ""
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}