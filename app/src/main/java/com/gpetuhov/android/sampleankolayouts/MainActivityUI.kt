package com.gpetuhov.android.sampleankolayouts
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.listeners.onClick

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { ctx.toast("Hello, ${name.text}!") }
            }
        }
    }
}