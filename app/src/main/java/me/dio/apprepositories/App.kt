package me.dio.apprepositories

import android.app.Application
import me.dio.apprepositories.data.di.DataModule
import me.dio.apprepositories.domain.di.DomainModule
import me.dio.apprepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}