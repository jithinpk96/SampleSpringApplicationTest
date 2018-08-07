package com.kg.sampll;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 */
@RestController
public class HomeController {
    @RequestMapping(value="/")
    public String sample(){

        return "helloworld";
    }

    
}