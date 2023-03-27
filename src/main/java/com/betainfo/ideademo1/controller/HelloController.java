package com.betainfo.ideademo1.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ggk
 * @time 2022-09-20 9:35
 **/
@RestController
@RequestMapping("/hello")
@Scope("prototype")
public class HelloController {

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "nnn",required = false) String name){
        System.out.println(name);

        Map<String, String> mymap = new HashMap<String, String>();


        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }


        return "123";
    }
}
