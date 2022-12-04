package com.yeahbutstill.demospring3.controller;

import com.yeahbutstill.demospring3.entity.GreetResponse;
import com.yeahbutstill.demospring3.entity.GreetResponseV1;
import com.yeahbutstill.demospring3.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse("Hello");
    }

    @GetMapping("/greet/V1")
    public GreetResponseV1 greetV1() {

        return new GreetResponseV1(
                "Hello",
                List.of("Java", "Kotlin", "TS"),
                new Person("Dani", 28, 30_000)
        );
    }

}
