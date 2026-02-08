package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/")
    fun sayHello(): String {
        return "Hello, Welcome to Spring Boot"
    }
}
