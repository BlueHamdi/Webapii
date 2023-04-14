package com.example.webapii;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello girl";
    }


}


