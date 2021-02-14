package com.github.castasat.esplen.domain

import com.github.castasat.esplen.domain.interfaces.Responsibility

class CodeBlock : Any(), Responsibility {
    override fun responsibility(): String = RESPONSIBILITY

    companion object {
        const val RESPONSIBILITY =
            "CodeBlock represents a programming language entity, " +
                    "many of which when combined, give a program. " +
                    "New CodeBlock may be constructed from existing ones."
    }
}