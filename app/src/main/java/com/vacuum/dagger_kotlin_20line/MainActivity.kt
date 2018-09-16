package com.vacuum.dagger_kotlin_20line

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject @field:Named("A")lateinit var a:Info
    @Inject @field:Named("B")lateinit var b:Info


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerInfoComponant.create().inject(this)
        text.text = "hi, ${a.test} : ${b.test}"
    }

}

