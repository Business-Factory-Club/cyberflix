package club.businessfactory.cyberflix

import android.app.Application
import club.businessfactory.cyberflix.di.applicationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(listOf(applicationModule))
        }
    }
}