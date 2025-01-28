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

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public static String getDailyWorkout(){
        return "Be IRONMan";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workoutMore1")
    public static String getDailyWorkoutMore(){
        return "IRONMan1";
    }


}


