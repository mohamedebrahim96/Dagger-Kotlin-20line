package com.vacuum.dagger_kotlin_20line

import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named

@Module
open class InfoModule {

    @Provides @Named("A")
    open fun ProvideNameA():Info{
        return Info("hi")
    }

    @Provides @Named("B")
    open fun ProvideNameB():Info{
        return Info("Antonyy")
    }
}