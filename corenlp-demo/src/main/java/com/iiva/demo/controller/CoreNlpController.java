package com.iiva.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/corenlp")
public class CoreNlpController {

    @GetMapping("/test")
    public String tokenize() {

        return "ok";
    }


}
