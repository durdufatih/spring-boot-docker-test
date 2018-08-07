package com.softpera.dockertutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloControllwe {

    @GetMapping("hi")
    public String hello() {
        return "Hello";
    }
}
