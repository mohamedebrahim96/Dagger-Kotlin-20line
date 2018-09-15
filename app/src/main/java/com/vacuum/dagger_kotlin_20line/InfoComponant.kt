package com.vacuum.dagger_kotlin_20line

import dagger.Component

@Component
interface InfoComponant {
    fun poke(main:MainActivity)
}