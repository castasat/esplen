package com.github.castasat.esplen.domain

import org.junit.Assert.*
import org.junit.Test
import kotlin.reflect.full.companionObjectInstance
import kotlin.reflect.full.functions

/**
 * Tests CodeBlock class specification
 */
class CodeBlockTest {

    /**
     * TODO
     *  EmptyCodeBlock
     *  Data
     *  Logic
     *  Body
     *  Cycle (For, While)
     *  Condition (If, When, Switch)
     *  Assertion
     *  Log is Behavior
     *  DebugStep is Behavior
     *  Structure
     *  Alphabet
     *  Syntax
     *  Semantics
     *  Formula
     *  Equation
     *  Inequality
     *  EquationSystem
     *  Commentary is EmptyCodeBlock, Data
     *  Constant is Data
     *  Variable is Data
     *  Operand is Data
     *  Meta is Commentary
     *  Behavior
     *  Operator is Behavior, Word
     *  Function is Behavior
     *  TestCodeBlock is Behavior
     *  Statement
     *  Mutable / Immutable
     *  Annotation
     *  Property
     *  Field
     *  Method
     *  Extension
     *  Enumeration
     *  Class
     *  Type
     *  AccessibilityModifier is Word
     *  Lambda
     *  Interface
     *  Template
     *  Macro
     *  Evaluation
     *  Invocation
     *  Reflection
     *  Expansion / Collapse
     */

    @Test
    fun responsibilityFunctionShouldBePresentInCodeBlock() {
        val responsibilityFunction =
            CodeBlock::class.functions.first { function -> function.name == "responsibility" }
        assertNotNull(
            "responsibility() function should be present in CodeBlock",
            responsibilityFunction
        )
    }

    @Test
    fun responsibilityFunctionShouldReturnResponsibilityConstant() {
        val block = CodeBlock()
        assertEquals(
            "Responsibility function should return responsibility constant",
            block.responsibility(),
            (CodeBlock::class.companionObjectInstance as CodeBlock.Companion).RESPONSIBILITY
        )
    }
}