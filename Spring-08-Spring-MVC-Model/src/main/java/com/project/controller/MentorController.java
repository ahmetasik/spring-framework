package com.project.controller;

import com.project.enums.Gender;
import com.project.model.Mentor;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
    @RequestMapping("/mentor")
    public String mentorPage(Model model){
        List<Mentor> mentor = new ArrayList<>();
        mentor.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentor.add(new Mentor("Tom","Hanks",65, Gender.MALE));
        mentor.add(new Mentor("Ammy","Bryan",25, Gender.FEMALE));

        model.addAttribute("mentor",mentor);

        return "mentor/mentor";
    }

}
