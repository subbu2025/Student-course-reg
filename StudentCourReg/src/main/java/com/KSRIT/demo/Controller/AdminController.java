package com.KSRIT.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.KSRIT.demo.services.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public ModelAndView showLoginForm() {
        return new ModelAndView("admin/login");
    }

    @PostMapping("/login")
    public ModelAndView adminLogin(@RequestParam String username,
                                   @RequestParam String password) {
        com.KSRIT.demo.Admin admin = adminService.login(username, password);
        ModelAndView mv = new ModelAndView();
        if (admin != null) {
            mv.setViewName("admin/dashboard");
        } else {
            mv.setViewName("admin/login");
            mv.addObject("error", "Invalid username or password");
        }
        return mv;
    }
}
