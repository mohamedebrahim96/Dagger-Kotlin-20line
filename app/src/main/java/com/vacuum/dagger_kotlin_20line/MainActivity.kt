package com.vacuum.dagger_kotlin_20line

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject @field:Named("Hi")  lateinit var hi :Info
    @Inject @field:Named("Named") lateinit var hello: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DaggerInfoComponant.create().poke(this)
        text.text = "${hi.text}  ${hello.text}"

    }
}

