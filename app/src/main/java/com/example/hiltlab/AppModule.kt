package com.example.hiltlab

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule() {

    @Singleton
    @Synchronized
    @Provides
    fun provideCommonBean() = CommonBean()
}