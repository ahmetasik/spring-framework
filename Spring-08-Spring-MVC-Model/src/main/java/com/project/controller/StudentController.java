package com.project.controller;

import com.project.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        int studentId = new Random().nextInt();
        model.addAttribute("ID", studentId);

        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        model.addAttribute("numbers",number);

        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome";
    }
}
