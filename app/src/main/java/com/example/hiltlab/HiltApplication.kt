package com.example.hiltlab

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class HiltApplication : Application() {

    @Inject
    lateinit var commonBean: CommonBean

    override fun onCreate() {
        super.onCreate()
        mCommonBean = commonBean

    }

    companion object {
        private lateinit var mCommonBean: CommonBean

        fun getCommonBean(): CommonBean = mCommonBean
    }
}