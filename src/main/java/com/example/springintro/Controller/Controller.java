package com.example.springintro.Controller;

import com.example.springintro.Services.IsItFriday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller{
    @GetMapping("/first-mapping")
    public String firstMapping(){
        return "Hello world";
    }

    @GetMapping("/second-mapping")
    public String secondMapping(){
        return "Second mapping";

    }

    @GetMapping("/index")
    public String index(){
        return "Welcome to my Spring Application";
    }
    @GetMapping("parameter")
    public String parameter(@RequestParam String param){

        return param + " " + ":)";
    }

   @GetMapping("/erdetfredag")
    public String erDetFredag(){

        return "Is it friday?\n " + IsItFriday.fridayCalculator();

   }













}