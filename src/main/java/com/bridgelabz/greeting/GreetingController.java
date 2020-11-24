package com.bridgelabz.greeting;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController{

    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value = {"","/","/home"})
        public Greeting showGreeting(@RequestParam(value = "name", defaultValue = "World")String name){
            User user = new User();
            user.setFirstName(name);
            return greetingService.addGreeting(user);
        }

//        @PostMapping("/post")
//    public Greeting postGreeting(@RequestBody Greeting greeting){
//        return greeting;
//    }
//
//    @PutMapping("/put")
//    public Greeting putGreeting(@RequestBody Greeting greeting){
//        return greeting;
//    }
}
