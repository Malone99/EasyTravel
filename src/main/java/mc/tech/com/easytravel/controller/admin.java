package mc.tech.com.easytravel.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@RestController
@Controller
@RequiredArgsConstructor
public class admin {
//    private final UserService repository;
    @GetMapping({"/admin"})
    public ModelAndView Dashboard_Admin()
    {
        ModelAndView modelAndView = new ModelAndView("mc-admin/Admin");
        modelAndView.addObject("message", "Baeldung");
        return modelAndView;
    }
    @GetMapping({"/admin-user"})
    public ModelAndView Dashboard_Admin_listOfUsers()
    {
        ModelAndView modelAndView = new ModelAndView("mc-admin/user-admin");
//        List<USER> list1=  this.repository.findALL();
//        log.info("LIST",list1);
//        modelAndView.addObject("StudentAll" ,list1);
        return modelAndView;
    }
    @GetMapping({"/admin-user-status"})
    public ModelAndView Dashboard_Admin_listOfUsers_status()
    {
        ModelAndView modelAndView = new ModelAndView("mc-admin/admin-status");
        modelAndView.addObject("message", "Baeldung");
        return modelAndView;
    }
    @GetMapping({"/document"})
    public ModelAndView document_Admin()
    {
        ModelAndView modelAndView = new ModelAndView("Apply");
        modelAndView.addObject("message", "Baeldung");
        return modelAndView;
    }

}
