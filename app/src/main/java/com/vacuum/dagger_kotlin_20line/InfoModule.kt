package com.vacuum.dagger_kotlin_20line

import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class InfoModule {

    @Provides @Named("Hi")
    fun ProvideInfoHi():Info{
        return Info("Hi")
    }

    @Provides @Named("Named")
    fun ProvideName():Info{
        return Info("Mohamedebrahim")
    }
}