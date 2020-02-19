package com.aishahfa.helloworld;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController annotation, which marks the class as a controller where every method returns a domain object instead of a view.
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //@GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method
    @GetMapping("/greeting")
    //@RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
    //If the name parameter is absent in the request, the defaultValue of World is used.

    public @ResponseBody String greeting()
    {
        return "Hello world";
    }

    /*
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
     */
}
