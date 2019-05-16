package com.harbour.ws.controller;


import com.harbour.ws.dao.test.StudentDao;
import com.harbour.ws.dao.test1.Student1Dao;
import com.harbour.ws.domain.test.Student;
import com.harbour.ws.domain.test1.Student1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContainerBerthController {

    private final StudentDao studentDao;
    private final Student1Dao student1Dao;

    public ContainerBerthController(StudentDao studentDao,Student1Dao student1Dao) {
        this.studentDao = studentDao;
        this.student1Dao = student1Dao;
    }

    //获取堆场名称基本信息
    @GetMapping("/test")
    public List<Student> gettest() {
        return  studentDao.findAll();
    }

    //获取堆场名称基本信息
    @GetMapping("/test1")
    public List<Student1> gettest1() {
        return student1Dao.findAll();
    }
}
