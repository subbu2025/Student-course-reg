package com.KSRIT.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.KSRIT.demo.Student;
import com.KSRIT.demo.services.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public ModelAndView showRegistrationForm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student/register");
        return mv;
    }

    @PostMapping("/register")
    public ModelAndView registerStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student/login");
        return mv;
    }

    @GetMapping("/login")
    public ModelAndView showLoginForm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student/login");
        return mv;
    }

    @PostMapping("/login")
    public ModelAndView loginStudent(@RequestParam String email,
                                     @RequestParam String password) {
        Student student = studentService.login(email, password);
        ModelAndView mv = new ModelAndView();
        if (student != null) {
            mv.setViewName("student/home");
            mv.addObject("student", student);
        } else {
            mv.setViewName("student/login");
            mv.addObject("error", "Invalid credentials");
        }
        return mv;
    }
}