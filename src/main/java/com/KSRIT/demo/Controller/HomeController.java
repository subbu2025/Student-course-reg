package com.KSRIT.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/subbu")  // Changed from "/" to "/reg"
    public String showDashboard() {
        return "home";    // This loads home.html from templates folder
    }
}
