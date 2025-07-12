package com.KSRIT.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.KSRIT.demo.Course;
import com.KSRIT.demo.services.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/list")
    public ModelAndView listCourses() {
        List<Course> courses = courseService.getAllCourses();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("course/list");
        mv.addObject("courses", courses);
        return mv;
    }
 
    @GetMapping("/add")
    public ModelAndView addCourseForm() {
        ModelAndView mv = new ModelAndView("course/add");
        mv.addObject("course", new Course());
        return mv;
    }

    @PostMapping("/save")
    public ModelAndView saveCourse(@ModelAttribute Course course) {
        courseService.saveCourse(course);
        return new ModelAndView("redirect:/courses/list");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editCourse(@PathVariable Long id) {
        Course course = courseService.getCourseById(id);
        ModelAndView mv = new ModelAndView("course/edit");
        mv.addObject("course", course);
        return mv;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteCourse(@PathVariable Long id) {
        courseService.deleteCourseById(id);
        return new ModelAndView("redirect:/courses/list");
    }
}
