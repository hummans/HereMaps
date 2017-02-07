package com.burhan.here.presentation.view.splash;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.burhan.here.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class VisibleMarkerTest {

    @Rule
    public ActivityTestRule<SplashActivity> mActivityTestRule = new ActivityTestRule<>(SplashActivity.class);

    @Test
    public void gpsTest() {

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btn_nearby_places), withText("Nearby"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withId(R.id.ibtn_category_eat_drink), isDisplayed()));
        appCompatImageButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.snackbar_action), withText("NAVIGATE ME"), isDisplayed()));


    }

}
