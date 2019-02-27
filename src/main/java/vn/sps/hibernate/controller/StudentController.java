package vn.sps.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.sps.hibernate.entity.Student;
import vn.sps.hibernate.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/health")
    public String healthCheck() {
        return "everything is going well";
    }

    @GetMapping(value = "/students")
    public List<Student> findAllStudent() {
        return this.studentService.findAll();
    }

    @PostMapping(value = "/students")
    public String insertStudent() {
        this.studentService.insertStudent();
        return "Student has insert to DB!";
    }
}
