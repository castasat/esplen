package com.github.castasat.esplen.domain

import org.junit.Assert.*
import org.junit.Test
import kotlin.reflect.full.companionObjectInstance
import kotlin.reflect.full.functions

/**
 * Tests Object class specification
 */
class ObjectTest {
    private val objectUnderTest = object : Object() {
        override fun responsibility(): String = RESPONSIBILITY
    }

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
    fun responsibilityFunctionShouldReturnResponsibilityConstant() {
        assertEquals(
            "Responsibility should be present in Object",
            objectUnderTest.responsibility(),
            (Object::class.companionObjectInstance as Object.Companion).RESPONSIBILITY
        )
    }
}