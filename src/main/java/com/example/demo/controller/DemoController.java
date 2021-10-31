package com.example.demo.controller;

import com.example.demo.model.EnvSystemConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @GetMapping(value="/check")
    public EnvSystemConfig getCheckConfig(){
        EnvSystemConfig env = new EnvSystemConfig(123L, new Date());

        return env;
    }

}
