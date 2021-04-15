package ru.ezhov.springvalidator.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class Parent(
        @get:NotNull @get:Size(min = 1)
        @JsonProperty("source") val source: kotlin.String,

        @get:NotNull
        @JsonProperty("child") val child: Child
)