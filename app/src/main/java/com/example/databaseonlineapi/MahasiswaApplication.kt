package com.example.databaseonlineapi
import android.app.Application
import com.example.databaseonlineapi.depedenciesInjection.AppContainer
import com.example.databaseonlineapi.depedenciesInjection.MahasiswaContainer


class MahasiswaApplication:Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }

}