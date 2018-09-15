package com.vacuum.dagger_kotlin_20line

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Qualifier


@Module
class InfoModule {

    @Provides @Named("Hi")
    fun ProvideInfoHi():Info{
        return Info("hi")
    }


    @Provides @Named("Hello")
    fun ProvideInfoHello():Info{
        return Info("mohamed")
    }

    /*@Qualifier
    @MustBeDocumented
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    annotation class Choose(val value: String = "")*/

}