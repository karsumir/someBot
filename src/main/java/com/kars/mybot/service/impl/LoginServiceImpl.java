package com.kars.mybot.service.impl;

import com.kars.mybot.Dao.LoginDao;
import com.kars.mybot.Entity.UserInfo;
import com.kars.mybot.Enum.ResultEnum;
import com.kars.mybot.Form.LoginForm;
import com.kars.mybot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao dao;

    public ResultEnum getLogin(LoginForm form) {

        UserInfo info = dao.findByUserIdAndUserPassword(form.getUserId(), form.getPassword());

        return ResultEnum.OK;
    }

}
