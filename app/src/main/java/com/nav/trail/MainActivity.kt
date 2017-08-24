package com.nav.trail

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayHello(view: View) {
        val name: String = (findViewById<EditText>(R.id.name)).text.toString()
        if (!name.isEmpty()) {
            val homeActivity = Intent(this, HomeActivity::class.java)
            homeActivity.putExtra("name", name)
            startActivity(homeActivity)
        }
    }
}
