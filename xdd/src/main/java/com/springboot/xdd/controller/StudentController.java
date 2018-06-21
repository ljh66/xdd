package com.springboot.xdd.controller;

import com.springboot.xdd.model.Result;
import com.springboot.xdd.model.Student;
import com.springboot.xdd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/deleteStudentById",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public Result deleteStudentById(String id){
        Result res = new Result();
        try {
            Integer stuId = null;
            if (id != null && !"".equals(id)) {
                stuId = new Integer(id);
            }
            studentService.deleteByPrimaryKey(stuId);
        }catch(Exception e)
        {
            e.printStackTrace();
            res.setStatu("error");
            res.setMessage("删除失败");
        }
        res.setStatu("success");
        res.setMessage("删除成功");

        return res;
    }
}
