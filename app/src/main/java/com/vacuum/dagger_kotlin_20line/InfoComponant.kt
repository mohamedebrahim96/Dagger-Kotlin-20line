package com.vacuum.dagger_kotlin_20line

import dagger.Component

@Component(modules = [InfoModule::class,InfoModule::class])
interface InfoComponant {
    fun poke(main:MainActivity)
}