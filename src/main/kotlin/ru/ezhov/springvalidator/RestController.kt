package ru.ezhov.springvalidator

import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import ru.ezhov.springvalidator.model.notwork.NotWorkParent
import ru.ezhov.springvalidator.model.work.WorkParent
import javax.validation.Valid

@RestController
@Validated
@RequestMapping("/valid")
class RestController {

    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/not-work"],
            consumes = ["application/json"]
    )
    fun test1(
            @Valid @RequestBody notWorkParent: NotWorkParent
    ): String = notWorkParent.toString()

    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/work"],
            consumes = ["application/json"]
    )
    fun test2(
            @Valid @RequestBody workParent: WorkParent
    ): String = workParent.toString()
}