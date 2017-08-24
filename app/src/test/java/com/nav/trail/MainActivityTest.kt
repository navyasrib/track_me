package com.nav.trail

import android.app.Activity
import android.widget.Button
import android.widget.EditText
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows
import kotlin.test.assertNotNull
import kotlin.test.assertNull


@RunWith(RobolectricTestRunner::class)
class MainActivityTest {
    lateinit var activity: Activity

    @Before
    fun setup() {
        activity = Robolectric.setupActivity(MainActivity::class.java)
    }

    @Test
    fun shouldStartHomeActivityWhenNameIsProvided() {
        val name = "Navya"
        activity.findViewById<EditText>(R.id.name).setText(name)
        activity.findViewById<Button>(R.id.login_button).performClick()

        val nextStartedActivity = Shadows.shadowOf(activity).getNextStartedActivity()
        assertNotNull(nextStartedActivity)
        assertEquals(name, nextStartedActivity.getStringExtra("name"))
    }

    @Test
    fun shouldNotStartHomeActivityWhenNameIsNotProvided() {
        activity.findViewById<Button>(R.id.login_button).performClick()

        val nextStartedActivity = Shadows.shadowOf(activity).getNextStartedActivity()
        assertNull(nextStartedActivity)
    }
}