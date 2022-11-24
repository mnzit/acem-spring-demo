package com.acem.spring.demo.controller;

import com.acem.spring.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentUIController {

    private final StudentService studentService;

    public StudentUIController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ModelAndView students(Model model) {
        model.addAttribute("students", studentService.getAll().getData());
        return new ModelAndView("students/list");
    }

    @GetMapping("/{id}")
    public ModelAndView student(@PathVariable("id") Long id, Model model) {
        model.addAttribute("response", studentService.getById(id));
        return new ModelAndView("students/one");
    }

    @GetMapping("/email/{email}")
    public ModelAndView student(@PathVariable("email") String email, Model model) {
        model.addAttribute("response", studentService.getByEmailAddress(email));
        return new ModelAndView("students/one");
    }
}
