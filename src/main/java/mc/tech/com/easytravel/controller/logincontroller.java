package com.mc.tech.kim_chris_highschool.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
@Controller
@RequiredArgsConstructor
public class login {
    @GetMapping({"/login"})
    public ModelAndView homepage()
    {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("message", "Baeldung");
        return modelAndView;
    }
}
