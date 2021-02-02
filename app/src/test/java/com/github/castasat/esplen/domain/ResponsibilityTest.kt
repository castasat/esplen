package com.github.castasat.esplen.domain

import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Tests responsibility specification
 * TODO Responsibility of any class should be accessible without class construction
 */
class ResponsibilityTest {

    @Test
    fun responsibilityShouldBeAnInterface() {
        assertTrue(
            "Responsibility should be an interface",
            Responsibility::class.java.isInterface
        )
    }

    @Test
    fun responsibilityShouldBeAFunctionalInterface() {
        assertTrue(
            "Responsibility should be a functional interface",
            Responsibility::class.java.isAnnotationPresent(
                FunctionalInterface::class.java
            )
        )
    }

    @Test
    fun responsibilityShouldNotBeNull() {

        val responsibilityUnderTest = object : Responsibility{
            override fun responsibility(): String {
                return "single responsibility"
            }
        }

        assertNotEquals(
            "Responsibility should not be null",
            null,
            responsibilityUnderTest.responsibility()
        )
    }
}