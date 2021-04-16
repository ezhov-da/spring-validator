package ru.ezhov.springvalidator.model.get

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class Child(
        @get:NotNull
        val enum: Enum,

        @get:NotNull
        @get:Size(min = 1)
        val destination: kotlin.String
)
