package com.bridgelabz.greeting;


import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class Greetings {
    private static final String template = "Hello %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("")
        public Greeting showGreeting(@RequestParam(value = "name", defaultValue = "World")String name){
            return new Greeting(counter.incrementAndGet(),String.format(template,name));
        }

        @PostMapping("/post")
    public Greeting postGreeting(@RequestBody Greeting greeting){
        return greeting;
    }

    @PutMapping("/put")
    public Greeting putGreeting(@RequestBody Greeting greeting){
        return greeting;
    }
}
