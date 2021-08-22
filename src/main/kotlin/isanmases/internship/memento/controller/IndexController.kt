package isanmases.internship.memento.controller

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class IndexController {
    @GetMapping("/", produces = [MediaType.TEXT_PLAIN_VALUE])
    @ResponseBody
    fun index(): String {
        return "Hello, Memento"
    }
}