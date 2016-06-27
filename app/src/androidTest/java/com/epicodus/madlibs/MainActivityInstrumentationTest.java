package com.epicodus.madlibs;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by Guest on 6/27/16.
 */
public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.nounOne)).perform(typeText("Jeff"))
                .check(matches(withText("Jeff")));
    }

    @Test
    public void nounIsSentToMadLibActivity() {
        onView(withId(R.id.nounOne)).perform(typeText("Jeff"));
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.locationTextView)).check(matches
                (withText("The Jeff went to the  with  and  before  and they lived happily ever after.")));
    }
}
