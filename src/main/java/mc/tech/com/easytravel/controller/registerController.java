package mc.tech.com.easytravel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@Slf4j
@RestController
@Controller
public class registerController {

    @GetMapping({"/register"})
    public ModelAndView register()
    {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("passing register form", "login");
        return modelAndView;
    }
}
