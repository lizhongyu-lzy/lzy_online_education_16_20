package com.lzy.service.impl;

import com.lzy.dao.EducationMapper;
import com.lzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl {

    @Autowired
    private EducationMapper educationMapper;


//    public Page getlist(){
//
//        Page<User> pages = educationMapper.findAll(PageRequest.of(0, 3));
//        return pages;
//    }
//    public List<User> getlist(){
//
//
////        educationMapper.save(new User());
////        S save = educationMapper.save(new User());
////        educationMapper.delete(new User());
//        return pages;
//    }


}
