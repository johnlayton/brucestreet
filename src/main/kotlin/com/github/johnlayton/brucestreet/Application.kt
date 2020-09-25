package com.github.johnlayton.brucestreet

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.github.johnlayton.brucestreet")
                .mainClass(Application.javaClass)
                .start()
    }
}