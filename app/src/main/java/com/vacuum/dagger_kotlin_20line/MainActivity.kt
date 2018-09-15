package com.vacuum.dagger_kotlin_20line

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var test :Info
    @Inject lateinit var ass: Ass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerInfoComponant.create().poke(this)
        text.setText(ass.hall)

    }
}

