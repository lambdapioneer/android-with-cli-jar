package org.example.droidjar.app

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test checking UI behaviour
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testStringCount_whenHelloEntered_thenToastShows4UniqueChars() {
        // action
        onView(withId(R.id.edit_input_string)).perform(
            clearText(),
            typeText("Hello"),
            closeSoftKeyboard()
        )
        onView(withId(R.id.button_count_unique)).perform(click())

        // assert
        onView(withId(R.id.text_output_info))
            .check(matches(withText(containsString("4 unique characters"))))
    }
}
