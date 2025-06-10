package com.KSRIT.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.KSRIT.demo.Course;
import com.KSRIT.demo.Registration;
import com.KSRIT.demo.Student;
import com.KSRIT.demo.services.CourseService;
import com.KSRIT.demo.services.RegistrationService;
import com.KSRIT.demo.services.StudentService;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public ModelAndView showAvailableCourses(@RequestParam Long studentId) {
        List<Course> courses = courseService.getAllCourses();
        ModelAndView mv = new ModelAndView("registration/courses");
        mv.addObject("courses", courses);
        mv.addObject("studentId", studentId);
        return mv;
    }

    @PostMapping("/register")
    public ModelAndView registerCourse(@RequestParam Long studentId,
                                       @RequestParam Long courseId) {
        Student student = studentService.getStudentById(studentId);
        Course course = courseService.getCourseById(courseId);

        Registration reg = new Registration();
        reg.setStudent(student);
        reg.setCourse(course);

        registrationService.registerCourse(reg);

        return new ModelAndView("redirect:/registration/mycourses?studentId=" + studentId);
    }

    @GetMapping("/mycourses")
    public ModelAndView viewRegisteredCourses(@RequestParam Long studentId) {
        Student student = studentService.getStudentById(studentId);
        List<Registration> registrations = registrationService.getRegistrationsByStudent(student);

        ModelAndView mv = new ModelAndView("registration/mycourses");
        mv.addObject("registrations", registrations);
        return mv;
    }

    @GetMapping("/deregister/{id}")
    public ModelAndView deregisterCourse(@PathVariable Long id, @RequestParam Long studentId) {
        registrationService.deregisterCourse(id);
        return new ModelAndView("redirect:/registration/mycourses?studentId=" + studentId);
    }
}
