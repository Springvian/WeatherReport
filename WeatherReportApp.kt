package com.example.weatherreport

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession

class WeatherReportApp: Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN="0yFjlU3crKu5q4XS"//令牌
    }

    override fun onCreate() {
        super.onCreate()
        context= applicationContext
    }

}