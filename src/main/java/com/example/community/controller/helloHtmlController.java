package com.example.community.controller;/*skt*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloHtmlController {
    @GetMapping("/hellohtml")
    public  String helloHtmlController(Model model){

        return "hello";
    }
}
