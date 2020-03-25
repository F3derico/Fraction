package com.academy.tdd.fraction;

import org.hamcrest.core.AnyOf;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.internal.matchers.Any;

import com.academy.tdd.fraction.Fraction;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class FractionTest {


    @BeforeClass
    public static void setupOnceAtStartup() {
        System.out.println("Execute this only once...");
    }

    @Before
    public void setupBeforeEach() {
        System.out.println("Before each test...");
        System.out.println("Before each test...");
    }

    @After
    public void teardownAfterEach() {
        System.out.println("After each test...");
    }

    @After
    public void settingNullCriticalObject() {
        System.out.println("Setting null that");
        System.out.println("Setting null that");
        System.out.println("Setting null that");
    }

    @Test
    public void shouldDoSomething() {

    }


}