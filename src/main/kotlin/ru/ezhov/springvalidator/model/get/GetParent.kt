package ru.ezhov.springvalidator.model.get

import javax.validation.Valid
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class GetParent(
        @get:NotNull @get:Size(min = 1)
        val source: kotlin.String,

        @get:NotNull @get:Valid
        val child: Child
)