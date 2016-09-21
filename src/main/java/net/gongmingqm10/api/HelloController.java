package net.gongmingqm10.api;

import net.gongmingqm10.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping("")
    public Student index() {
        Student student = new Student("Ming Gong", 25);
        return student;
    }
}