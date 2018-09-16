package com.vacuum.dagger_kotlin_20line

import dagger.Component
import dagger.internal.DaggerCollections
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import javax.inject.Inject
import javax.inject.Named

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TestMainActivity {

    @Inject @field:Named("A") lateinit var infoLove: Info
    @Inject @field:Named("B") lateinit var infoHello: Info

    @Before
    fun setup2() {
        //DaggerTestMagicBox.builder().infoModule(TestInfo()).build().inject(this)
        DaggerTestComponant.builder().infoModule(TestInfo()).build().inject(this)
    }

    @Test
    fun simpleTest2() {
        assertEquals("Test Love", infoLove.test)
        assertEquals("Antonyy", infoHello.test)
    }
}

class TestInfo: InfoModule() {
    override fun ProvideNameA(): Info {
        return Info("Test Love")
    }
}

@Component(modules = [InfoModule::class])
interface TestComponant : InfoComponant {
    fun inject(app: TestMainActivity)
}