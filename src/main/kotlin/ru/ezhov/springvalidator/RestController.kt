package ru.ezhov.springvalidator

import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import ru.ezhov.springvalidator.model.get.GetParent
import ru.ezhov.springvalidator.model.field.FieldParent
import javax.validation.Valid

@RestController
@Validated
@RequestMapping("/valid")
class RestController {

    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/get"],
            consumes = ["application/json"]
    )
    fun test1(
            @Valid @RequestBody getParent: GetParent
    ): String = getParent.toString()

    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/field"],
            consumes = ["application/json"]
    )
    fun test2(
            @Valid @RequestBody fieldParent: FieldParent
    ): String = fieldParent.toString()
}