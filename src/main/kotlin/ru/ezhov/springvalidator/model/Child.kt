package ru.ezhov.springvalidator.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class Child(
        @get:NotNull
        @JsonProperty("type")
        val enum: Enum,

        @get:NotNull
        @get:Size(min = 1)
        @JsonProperty("destination")
        val destination: kotlin.String
)
