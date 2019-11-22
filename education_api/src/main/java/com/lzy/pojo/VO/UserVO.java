package com.lzy.pojo.VO;

import com.lzy.pojo.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO extends User {

    private String loginName;
    private String registName;
    private String logoinPass;
    private String registPass;


}
