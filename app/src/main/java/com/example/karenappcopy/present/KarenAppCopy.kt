package com.example.karenappcopy.present

import android.app.Application
import com.example.karenappcopy.domain.domainDI.domainKoinModule
import com.example.karenappcopy.present.presentDI.mainViewKoinModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KarenAppCopy : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@KarenAppCopy)
            modules(
                mainViewKoinModel,
                domainKoinModule)

        }
    }

}
