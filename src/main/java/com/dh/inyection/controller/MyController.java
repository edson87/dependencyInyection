package com.dh.inyection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String Hello(){
        String var = "Hello Spring";
        return var;
    }
}
