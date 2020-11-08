package com.thoughtworks.capability.demospringioccontainer;


import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController  {


    @Lookup
    public GreetingService getGreetingService(){
        return null;
    }

    public GreetingController(){
        System.out.println("create new  greetingController bean");
    }


    @GetMapping("/greet")
    public String greet() {
        return getGreetingService().sayHi();
    }



}
