package com.lzy.service.impl;

import com.lzy.pojo.VO.UserVO;
import com.lzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.provider.MD5;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;


    @Override
    public Integer login(UserVO userVO) {
        String logoinPass = userVO.getLogoinPass();

        MD5 md5 = new MD5();

//        Object clone = md5.clone(logoinPass);

        userMapper.findByUserName();




        return ;
    }

    @Override
    public Integer regist(UserVO userVO) {
        return null;
    }
}
