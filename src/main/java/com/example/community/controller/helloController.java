package com.example.community.controller;/*skt*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    //@GetMapping("/hello")
    public  String indexController(){
        return "hello";

    }

    //    @GetMapping("/hello")
//    public String indexControler(@PathVariable("name") String name, Model model){
//
//        return "hello";
//    }
}
