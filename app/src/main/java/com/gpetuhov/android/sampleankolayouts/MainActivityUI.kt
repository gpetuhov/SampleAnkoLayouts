package com.gpetuhov.android.sampleankolayouts
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.listeners.onClick

// This is the code for MainActivity UI.
// We have no XML layout at all.
class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            val name = editText()
            button("Say Hello") {
                // To use this we need to add Anko Listeners dependency in our build script
                onClick { ctx.toast("Hello, ${name.text}!") }
            }
        }
    }
}