package com.acem.spring.demo.controller;

import com.acem.spring.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentUIController {

    private final StudentService studentService;

    public StudentUIController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    @RequestMapping("/student-list")
    public ModelAndView studentList(Model model) {
        model.addAttribute("students", studentService.getAll().getData());
        return new ModelAndView("students/list");
    }
}
