package com.examplehelloworld.helloworldapi.HelloWorldController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @GetMapping("helloworldapi")
    public String helloWorld()
    {
        System.out.println("Hi");
        return "HelloworldApi";
    }
}
