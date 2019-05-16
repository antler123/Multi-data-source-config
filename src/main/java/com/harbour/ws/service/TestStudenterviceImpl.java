package com.harbour.ws.service;

import com.harbour.ws.dao.test.StudentDao;
import com.harbour.ws.domain.test.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestStudenterviceImpl implements StudentDao {

    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
