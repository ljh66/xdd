package com.springboot.xdd.controller;

import com.springboot.xdd.model.Student;
import com.springboot.xdd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/findAllStudent",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }

    @RequestMapping(value = "/findStudentById",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public Student findStudentById(){
        return studentService.selectByPrimaryKey(1);
    }
}
