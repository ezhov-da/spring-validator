package ru.ezhov.springvalidator.model.field

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class FieldParent(
        @field:NotNull @get:Size(min = 1)
        val source: kotlin.String,

        @field:NotNull
        val child: Child
)