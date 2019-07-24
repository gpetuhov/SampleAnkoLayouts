package com.gpetuhov.android.sampleankolayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // We can write Anko Layout DSL code right here,
        // but in this example we define UI in AnkoComponent in a separate file.
        // Here we use this component in our activity.

        MainActivityUI().setContentView(this)
    }
}
