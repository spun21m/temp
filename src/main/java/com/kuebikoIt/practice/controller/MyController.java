package com.kuebikoIt.practice.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class MyController {

    private Map<String, String> dataStore = new HashMap<>();


    @RequestMapping(value = "/getValue", method = RequestMethod.GET)
    public String hello(@RequestParam String key){
        return dataStore.get(key);
    }

    @RequestMapping(value = "/putValue", method = RequestMethod.POST)
    public String hello(@RequestParam String key, @RequestParam String value){
        dataStore.put(key, value);
        return key;
    }
    

}
