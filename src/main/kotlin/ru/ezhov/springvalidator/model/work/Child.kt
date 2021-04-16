package ru.ezhov.springvalidator.model.work

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class Child(
        @field:NotNull
        val enum: Enum,

        @field:NotNull
        @field:Size(min = 1)
        val destination: kotlin.String
)
