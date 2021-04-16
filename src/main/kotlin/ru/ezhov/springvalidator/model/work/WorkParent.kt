package ru.ezhov.springvalidator.model.work

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class WorkParent(
        @get:NotNull @get:Size(min = 1)
        val source: kotlin.String,

        @get:NotNull
        val child: Child
)