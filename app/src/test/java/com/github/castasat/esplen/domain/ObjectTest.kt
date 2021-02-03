package com.github.castasat.esplen.domain

import org.junit.Assert.*
import org.junit.Test
import kotlin.reflect.full.functions

/**
 * Tests Object class specification
 */
class ObjectTest {

    @Test
    fun responsibilityFunctionShouldBePresentInObject() {
        val responsibilityFunction = Object::class
            .functions.first { function -> function.name == "responsibility" }
        assertNotNull(
            "responsibility() function should be present in Object",
            responsibilityFunction
        )
    }

    @Test
    fun responsibilityShouldReturnTheRightValue() {
        val objectUnderTest = Object()
        assertEquals(
            "Responsibility should be present in Object",
            "Object is a common ancestor of any data type",
            objectUnderTest.responsibility()
        )
    }

    @Test
    fun responsibilityShouldBeOverridenInSubtypeExtendingType() {
        class Subtype : Object() {
            override fun responsibility(): String = "Subtype's responsibility is to show that it is " +
                    "not equal to it's super's (Object's) responsibility"
        }

        val objectUnderTest = Object()
        val subtypeUnderTest = Subtype()

        assertNotEquals(
            "Responsibility should be overriden in Subtype extending Type",
            objectUnderTest.responsibility(),
            subtypeUnderTest.responsibility()
        )
    }
}