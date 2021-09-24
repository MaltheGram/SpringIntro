package com.example.springintro.Controller;

import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTML;
import java.time.LocalDate;



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
        String plainPrint = "It's not friday. It's " + LocalDate.now().getDayOfWeek();
        String htmlPrint = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>IT'S FRIDAY</title>\n" +
                "</head>\n" +
                "\n" +
                "<body style=\"background-color: steelblue\">\n" +
                "\n" +
                "<h1 style=\"color: red\\\">IT'S FRIDAY</h1>" +
                "</body>\n" +
                "</html>";

        int q = LocalDate.now().getDayOfMonth();
        int m = LocalDate.now().getMonthValue();
        int j = LocalDate.now().getYear() / 100;
        int k = LocalDate.now().getYear() % 100;

        int h = (q + (13*(m + 1) / 5) + k +(k / 4) + (j / 4) -2 * j) % 7;

        int d = ((h + 5)%7) +1;


        String print = d == 5 ? htmlPrint : plainPrint;

        return print;
   }













}