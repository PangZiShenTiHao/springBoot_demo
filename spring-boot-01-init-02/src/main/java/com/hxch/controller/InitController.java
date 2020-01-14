package com.hxch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InitController {

    @ResponseBody
    @RequestMapping("/init")
    public String inti(){
        return "hello init ...";
    }
}
