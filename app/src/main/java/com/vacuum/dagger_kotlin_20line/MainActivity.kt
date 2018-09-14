package com.vacuum.dagger_kotlin_20line

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var test :Info
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerInfoComponant.create().inject(this)
        text.setText(test.info)
    }
}

class Info @Inject constructor(){
    val info = "Hello porn"
}




@Component
interface InfoComponant{
    fun inject(main:MainActivity)
}