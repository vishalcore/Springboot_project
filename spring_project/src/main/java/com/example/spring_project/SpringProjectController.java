package com.example.spring_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringProjectController {
    @RequestMapping
    public String springProject(){
        return "Hello World from Springboot";
    }
}
