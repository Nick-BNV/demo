package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculator (
        @RequestParam(value = "a", defaultValue = "0") int a,
        @RequestParam(value = "operator", defaultValue = "sum") String operator,
        @RequestParam(value = "b", defaultValue = "0") int b,
        Model model
    )
        {
            model.addAttribute("a", a);
            model.addAttribute("operator", operator);
            model.addAttribute("b", b);
            int otvet=0;
            if (operator.equals("sum")){otvet=a+b;}
            if (operator.equals("sub")){otvet=a-b;}
            model.addAttribute("result", otvet);
            System.out.println(otvet);
            return "calculator";
        }



}
