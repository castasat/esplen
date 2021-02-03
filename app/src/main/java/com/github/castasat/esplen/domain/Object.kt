package com.github.castasat.esplen.domain

open class Object : Any(), Responsibility {
    override fun responsibility(): String = RESPONSIBILITY

    companion object {
        private const val RESPONSIBILITY = "Object is a common ancestor of any data type"
    }
}