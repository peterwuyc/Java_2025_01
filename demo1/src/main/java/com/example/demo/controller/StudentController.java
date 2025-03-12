package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.StudentRequestBody;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    // web
    // IOC
    @Autowired
    private StudentService studentService;

    // www.google.com -> DNS ip -> 127.0.0.1 -> 8080 -> application

    // get/read
    @GetMapping("/student")   // url mapping localhost:8080/student
    public ResponseEntity<Student> getStudentById(@RequestParam(value = "id")Integer id) {
        ResponseEntity<Student> responseEntity = ResponseEntity.ok(studentService.getStudent(id));
        return responseEntity;
    }

    @GetMapping("/student/name")   // url mapping localhost:8080/student
    public ResponseEntity<String> getStudentByName(@RequestParam(value = "name")String name) {
        return ResponseEntity.ok(studentService.getStudentEmailByName(name));
    }

    @PostMapping ("/student")// url mapping localhost:8080/student
    public String postStudentByName(@RequestBody StudentRequestBody requestBody) {
        studentService.addStudent(requestBody);
        return "success";
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT) // url mapping localhost:8080/student
    public String putStudentByName(Integer id, String email) {
        studentService.updateStudent(id, email);
        return "success";
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE) // url mapping localhost:8080/student
    public String deleteStudentByName(@PathVariable(value = "id") Integer id) {
        studentService.deleteStudent(id);
        return "success";
    }

    @GetMapping(value = "/student/all")
    public ResponseEntity<List<Student>> getAllStudent() {
        return ResponseEntity.ok(studentService.getStudents());
    }

    @GetMapping(value = "/student/page")
    public ResponseEntity<Page<Student>> findByPage(int page, int size) {
        return ResponseEntity.ok(studentService.getStudentsByPage(page, size));
    }

    // restful.  microservice , kafka message queue , testing , CICD. WCNP GCP AWS

}
