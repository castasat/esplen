package com.github.castasat.esplen.domain

import com.github.castasat.esplen.domain.interfaces.Responsibility

abstract class Object : Any(), Responsibility {
    abstract override fun responsibility(): String

    companion object {
        const val RESPONSIBILITY = "Object is a common ancestor of any data type"
    }
}