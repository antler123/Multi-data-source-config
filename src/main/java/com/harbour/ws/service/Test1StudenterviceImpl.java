package com.harbour.ws.service;


import com.harbour.ws.dao.test1.Student1Dao;
import com.harbour.ws.domain.test1.Student1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test1StudenterviceImpl implements Student1Dao {

    @Autowired
    private Student1Dao studentDao;


    @Override
    public List<Student1> findAll() {
        return studentDao.findAll();
    }
}
