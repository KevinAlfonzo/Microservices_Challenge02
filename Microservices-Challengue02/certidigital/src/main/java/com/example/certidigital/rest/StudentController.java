package com.example.certidigital.rest;

import com.example.certidigital.application.StudentService;
import com.example.certidigital.domain.Student;
import com.example.certidigital.domain.StudentRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

   StudentRepository studentRepository = new StudentOracle();


   StudentService studentService = new StudentService(studentRepository);

   @PostMapping
   public Student saveStudent(@RequestBody Student student){
     return studentService.saveStudent(student);
   }

}
