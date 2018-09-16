package com.vacuum.dagger_kotlin_20line

import dagger.Component

@Component(modules = [InfoModule::class])
interface InfoComponant {
    fun inject(main:MainActivity)

}