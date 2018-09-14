# Dagger-Kotlin-20line
Dagger 2 for Dummies in Kotlin (with 20 lines of code)

I am a dummy, and learning Dagger 2 is stretching my brain!! All tutorials I read introduced so many things to me at once e.g. Dependency Injection, Provider, Component, Module, Scope… my brain just exploded!!

Besides many tutorials are based on Java. Kotlin is the way of doing things today. It takes me months to digest Dagger 2 and had it done in Kotlin. So I vow to myself when I grab hold of it, I should create something really super simple one day, make this like ABC, for those out there like me looking for something like this.

To make it more fancier, I can change the Simple Hello World App to Simple Hello Dagger 2 App. Code as below (bold those I add on top of the template).
```
class MainActivity : AppCompatActivity() {

    val info = Info()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view.text = info.text

    }
}

class Info  {
    val text = "Hello Dagger 2"
}
```