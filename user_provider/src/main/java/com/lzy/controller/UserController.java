package com.lzy.controller;

import com.lzy.pojo.VO.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lzy.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("user/")
public class UserController {
    @Autowired
    private UserService userService;
    public Integer logonORregister(@RequestBody UserVO userVO){
        if(userVO.getLoginName() != null){
            return userService.login(userVO);
        }else {
            return userService.regist(userVO);
        }



    }
}
