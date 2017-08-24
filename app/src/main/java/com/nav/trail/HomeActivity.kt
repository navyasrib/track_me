package com.nav.trail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val name = intent.getStringExtra("name")
        (findViewById<TextView>(R.id.greet_user)).setText("Hello, " + name)
    }
}
