package com.AgginCodes.SpringBoot.MyCoolApp.RESTController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public static String sayHello(){
        return "Hello Aggin Codes";
    }

    // expose the get request of "/" that return hello world

}
