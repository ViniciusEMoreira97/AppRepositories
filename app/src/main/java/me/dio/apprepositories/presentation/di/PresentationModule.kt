package me.dio.apprepositories.presentation.di

import kotlinx.coroutines.InternalCoroutinesApi
import me.dio.apprepositories.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {

    fun load() {
        loadKoinModules(viewModelModule())
    }

    @OptIn(InternalCoroutinesApi::class)
    private fun viewModelModule(): Module {
        return module {
            viewModel { MainViewModel(get()) }
        }
    }
}