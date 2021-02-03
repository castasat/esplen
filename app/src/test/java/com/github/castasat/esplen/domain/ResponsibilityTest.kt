package com.github.castasat.esplen.domain

import org.junit.Assert.*
import org.junit.Test

/**
 * Tests Responsibility class specification
 */
class ResponsibilityTest {
    private val responsibilityClass = Responsibility::class.java
    private val functionalInterfaceClass = FunctionalInterface::class.java

    private val responsibilityUnderTest = object : Responsibility {
        override fun responsibility(): String = "single responsibility"
    }

    @Test
    fun responsibilityShouldBeAnInterface() {
        assertTrue(
            "Responsibility should be an interface",
            responsibilityClass.isInterface
        )
    }

    @Test
    fun responsibilityShouldBeAFunctionalInterface() {
        assertTrue(
            "Responsibility should be a functional interface",
            responsibilityClass.isAnnotationPresent(functionalInterfaceClass)
        )
    }

    @Test
    fun responsibilityShouldNotBeNull() {
        assertNotEquals(
            "Responsibility should not be null",
            null,
            responsibilityUnderTest.responsibility()
        )
    }

    @Test
    fun responsibilityShouldNotBeEmpty() {
        assertFalse(
            "Responsibility should not be empty",
            responsibilityUnderTest.responsibility().isEmpty()
        )
    }
}