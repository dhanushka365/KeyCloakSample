package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping(value ={"/","/login"})
    public ModelAndView login(){
        ModelAndView ModelAndView =new ModelAndView("login");
        return  ModelAndView;
    }
}
