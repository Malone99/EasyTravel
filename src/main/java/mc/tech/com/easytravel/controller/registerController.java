package mc.tech.com.easytravel.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mc.tech.com.easytravel.domain.User.USER;
import mc.tech.com.easytravel.domain.userAccount;
import mc.tech.com.easytravel.service.domain.userAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Slf4j
@RestController
@Controller
@RequiredArgsConstructor
public class registerController {

    private final userAccountService service;

    @GetMapping({"/register"})
    public  ModelAndView addStudent(){
        ModelAndView mav= new ModelAndView("mc-admin/register");
        userAccount account= new userAccount();
        mav.addObject("useraccount",account);
        return mav;
    }
    @PostMapping("/save")
    public RedirectView SaveStudent(@ModelAttribute userAccount name){


        this.service.save(name);
        return new RedirectView("http://localhost:8080/login");
    }
//
//    @GetMapping({"/user-list"})
//    public ModelAndView showEmployee(){
//        ModelAndView mav= new ModelAndView("list-Employees");
//        List<USER> list1=  this.service.
//        log.info("LIST",list1);
//        mav.addObject("StudentAll" ,list1);
//        return mav;
//    }
}
