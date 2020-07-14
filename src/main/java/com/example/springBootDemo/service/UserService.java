package com.example.springBootDemo.service;

import com.example.springBootDemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<Map<String,Object>> getAll(){
        return userDao.getAll();
    }
}
