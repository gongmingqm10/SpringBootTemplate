package net.gongmingqm10.controller;

import net.gongmingqm10.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute(new Student("Ming Gong", 25));
        return "home";
    }
}
