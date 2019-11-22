package com.lzy.service;

import com.lzy.pojo.VO.UserVO;

public interface UserService {
    Integer login(UserVO userVO);

    Integer regist(UserVO userVO);
}
