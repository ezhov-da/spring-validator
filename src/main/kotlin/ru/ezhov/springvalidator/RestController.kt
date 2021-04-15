package ru.ezhov.springvalidator

import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import ru.ezhov.springvalidator.model.Parent
import javax.validation.Valid

@RestController
@Validated
@RequestMapping("/valid")
class RestController {

    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/test"],
            consumes = ["application/json"]
    )
    fun test(
            @Valid @RequestBody parent: Parent
    ): String = parent.toString()
}