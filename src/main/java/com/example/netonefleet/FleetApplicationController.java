package com.example.netonefleet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FleetApplicationController {

    @GetMapping("/index")
    public String homePage(){
        return "index";
    }
}
