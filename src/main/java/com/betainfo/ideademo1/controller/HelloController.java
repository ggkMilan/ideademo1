package com.betainfo.ideademo1.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ggk
 * @time 2022-09-20 9:35
 **/
@RestController
@RequestMapping("/hello")
@Scope("prototype")
public class HelloController {

    @GetMapping("/hi")
    public String hi(){
        return "123";
    }
}
