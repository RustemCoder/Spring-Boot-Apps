package com.aisariyev.grades.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aisariyev.grades.models.Grade;
import com.aisariyev.grades.models.Show;

@Controller
public class GradeController {
    
    @GetMapping("/grades")
    public String  getGrades(Model model){
        Grade grade = new Grade("Harry","physics","A");
        model.addAttribute("grade",grade);

        return "grades";
    }

    @GetMapping("/")
    public String  getShows(Model model){
        model.addAttribute("first",new Show("Breaking Bad", "Ozymandias", 10.0));
        model.addAttribute("second",new Show("Attack on Titan", "Perfect Game", 9.9));
        model.addAttribute("third",new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        model.addAttribute("fourth",new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));
        return "shows";
    }

}
