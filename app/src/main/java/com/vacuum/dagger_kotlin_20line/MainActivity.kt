package com.vacuum.dagger_kotlin_20line

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Scope
import javax.inject.Singleton

class MainActivity : AppCompatActivity() {

    //@Inject @field:Named("A")lateinit var a:Info
    //@Inject @field:Named("B")lateinit var b:Info
    private lateinit var m: Magic

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //DaggerInfoComponant.create().inject(this)
        m = DaggerMagic.create()
        btn.setOnClickListener {
            val st = Storage()
            m.magic_inject(st)
            text.text = "Normal: ${st.normal.count} \n Unique: ${st.unique.count}"
        }
    }
}


    var staticnum = 0
    @Singleton
    class UniqueMagic @Inject constructor(){
        val count = staticnum++
    }

    class NormalMagic  @Inject constructor(){
        val count  = staticnum++
    }

    class Storage{
       @Inject lateinit var unique:UniqueMagic
        @Inject lateinit var normal:NormalMagic
    }

    @Singleton
    @Component
    interface Magic{
        fun magic_inject(storage:Storage)
    }




