package com.nova.springbootcrud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String greet() {
        return "Do not go into that good night!!";
    }
}
